import java.util.PriorityQueue;
import java.util.HashMap;

public class ReorganizeString {
    public static String reorganizeString(String s) {
        HashMap<Character, Integer> freqMap = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        
        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> freqMap.get(b) - freqMap.get(a));
        maxHeap.addAll(freqMap.keySet());
        
        StringBuilder result = new StringBuilder();
        Character prev = null;
        
        while (!maxHeap.isEmpty()) {
            char current = maxHeap.poll();
            result.append(current);
            
            if (prev != null && freqMap.get(prev) > 0) {
                maxHeap.offer(prev);
            }
            
            freqMap.put(current, freqMap.get(current) - 1);
            prev = (freqMap.get(current) > 0) ? current : null;
        }
        
        return result.length() == s.length() ? result.toString() : "";
    }
    
    public static void main(String[] args) {
        String s = "aab";
        System.out.println("The Output is: " + reorganizeString(s));
    }
}