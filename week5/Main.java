/**
 * ==========================================================
 * Program Name: Main
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 04-03-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
*/

interface PrintMessage {
    public void display();
}

interface PrintMessageWithArgument{
    public void display(String s);
}

interface PrintMessageWith2Arg{
    public void display(String s, int n);
}
public class Main {
    public static void main(String[] args) {
        PrintMessage p = new PrintMessage() {
            public void display(){
                System.out.println("Ind <Banam> Aus");
            }
        };
        p.display();

        // Using Lambda Expression...
        PrintMessage p2 = ()->{
            System.out.println("India Won <Using Lamba Danda>");
        };

        p2.display();


        PrintMessageWithArgument PA1 = (m)->{
            System.out.println("Message: " + m);
        };

        PA1.display("CHAI, PEGEYEGA...");

        PrintMessageWith2Arg PA2 = (m, n)->{
            System.out.println(m + " " + n);
        };

        PA2.display("Roll number: ", 15);
    }
}