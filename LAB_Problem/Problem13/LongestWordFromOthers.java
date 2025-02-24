import java.util.*;

public class LongestWordFromOthers {
    public static String findLongestWord(List<String> words) {
        Set<String> wordSet = new HashSet<>(words);
        words.sort((a, b) -> b.length() - a.length());
        
        for (String word : words) {
            wordSet.remove(word);
            if (canForm(word, wordSet)) {
                return word;
            }
            wordSet.add(word);
        }
        
        return "";
    }

    private static boolean canForm(String word, Set<String> wordSet) {
        if (word.isEmpty()) return false;
        int length = word.length();
        boolean[] dp = new boolean[length + 1];
        dp[0] = true;
        
        for (int i = 1; i <= length; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordSet.contains(word.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        
        return dp[length];
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("cat", "cats", "dog", "catsdog", "rat", "ratcatdogcat");
        String longestWord = findLongestWord(words);
        System.out.println("Longest word made of other words: " + longestWord);
    }
}