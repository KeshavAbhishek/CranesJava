import java.util.HashMap;

/**
 * ==========================================================
 * Program Name: CharFreqCounter
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 25-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

public class CharFreqCounter {
    public static void allUnique(String s){
        HashMap <Character, Integer> data = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character temp = s.charAt(i);
            if(data.containsKey(temp)){
                data.put(temp, data.get(temp) + 1);
            } else {
                data.put(temp, 1);
            }
        }

        for (char i : data.keySet()) {
            if(i==' '){}
            else{
                System.out.println(i + " = " + data.get(i));
            }
        }
    }
    public static void main(String[] args) {
        allUnique("Good bye to CVR");
    }
}