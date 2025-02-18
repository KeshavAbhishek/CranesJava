package LAB_Problem.Problem7;

import java.util.Scanner;

public class NumerOfWords {
    public static int countWord(String str){
        return str.trim().split(" ").length;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("No. of words = "+countWord(str));
        sc.close();
    }
}