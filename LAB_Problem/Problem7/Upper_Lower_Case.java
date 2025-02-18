package LAB_Problem.Problem7;

public class Upper_Lower_Case {
    public static void toUpper(String str){
        char strArray[] = str.toCharArray();
        for (int i = 0; i < strArray.length; i++) {
            if(strArray[i]>=97 && strArray[i]<=97+25){
                strArray[i] = (char)(strArray[i]-32);
            }
        }
        System.out.print(new String(strArray));
    }

    public static void toLower(String str){
        char strArray[] = str.toCharArray();
        for (int i = 0; i < strArray.length; i++) {
            if(strArray[i]>=65 && strArray[i]<=65+25){
                strArray[i] = (char)(strArray[i]+32);
            }
        }
        System.out.print(new String(strArray));
    }

    public static void main(String[] args) {
        System.out.println("Input: Welcome");
        toUpper("Welcome");
        System.out.println();
        System.out.println("\nInput: WELCOME");
        toLower("WELCOME");
    }
}