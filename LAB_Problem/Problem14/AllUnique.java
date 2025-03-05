import java.util.LinkedHashMap;
import java.util.Map;

/**
 * ==========================================================
 * Program Name: AllUnique
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 25-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

public class AllUnique {
    public static void allUnique(String s){
        Map <Character, Integer> data = new LinkedHashMap<>();
        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            Character temp = s.charAt(i);
            if(data.containsKey(temp)){
                data.put(temp, data.get(temp) + 1);
            } else {
                data.put(temp, 1);
            }
        }

        for (char i : data.keySet()) {
            if(data.get(i)!=1){
                flag = false;
                break;
            }
        }

        if(flag){
            System.out.println(s + " - All unique");
        }
        else{
            System.out.println(s + " - Not unique");
        }
    }
    public static void main(String[] args) {
        allUnique("hello");
        allUnique("world");
    }
}