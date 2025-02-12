// package week2.12-02-2025;

public class String_Ex4 {
    public static void main(String[] args){
        String s1 = "Sachin";
        String s2 = "Sachin";
        String s3 = new String(s1);
        String s4 = "Uendulkar";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.compareTo(s4));
    }
}