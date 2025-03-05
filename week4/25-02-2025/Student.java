import java.util.HashMap;

/**
 * ==========================================================
 * Program Name: Student
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 25-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

public class Student {
    public HashMap <String, String> data;
    public Student(){
        data = new HashMap<>();
    }

    public void addStud(String name, String grade){
        data.put(name, grade);
        System.out.println("Added Successfully.");
    }

    public void removeStud(String name){
        data.remove(name);
        System.out.println("Removed Successfully.");
    }

    public void updateGrade(String name, String oldGrade, String newGrade){
        data.replace(name, oldGrade, newGrade);
        System.out.println("Grade Updated Successfully.");
    }

    public void displayAll(){
        data.forEach((key, value)->{
            System.out.println(key + " -> " + value);
        });
    }
    public static void main(String[] args) {
        Student s = new Student();
        s.addStud("Aman", "A");
        s.addStud("Baman", "B");
        s.addStud("Caman", "C");
        s.addStud("Daman", "D");

        System.out.println();
        
        s.displayAll();

        s.removeStud("Caman");

        s.updateGrade("Aman", "A", "A+");

        s.displayAll();
    }
}