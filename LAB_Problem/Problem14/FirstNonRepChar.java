/**
 * ==========================================================
 * Program Name: FirstNonRepChar
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 25-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */
import java.util.*;
public class FirstNonRepChar {
    public static void fnrc(String s){
        Map <Character, Integer> data = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character temp = s.charAt(i);
            if(data.containsKey(temp)){
                data.put(temp, data.get(temp) + 1);
            } else {
                data.put(temp, 1);
            }
        }

        for (char i : data.keySet()) {
            if(data.get(i)==1){
                System.out.println(i);
                break;
            }
        }
    }
    public static void main(String[] args) {
        fnrc("programming");
    }
}