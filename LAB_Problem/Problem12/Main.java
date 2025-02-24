package LAB_Problem.Problem12;

import java.util.ArrayList;

/**
 * ==========================================================
 * Program Name: Main
 * Description :
 * Author : Keshav Abhishek
 * Created On : 22-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

class Student {
    String studentId;
    String studentName;
    String studentDept;
    double CGPA;

    public Student() {
    }

    public Student(String studentId, String studentName, String studentDept, double CGPA) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentDept = studentDept;
        this.CGPA = CGPA;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getstudentDept() {
        return studentDept;
    }

    public void setstudentDept(String studentDept) {
        this.studentDept = studentDept;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double cGPA) {
        CGPA = cGPA;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId + "\n" + "Student Name: " + studentName + "\n" + "Student Dept: "
                + studentDept + "\n" + "CGPA: " + CGPA + "\n";
    }
}

class StudentSystem {
    ArrayList<Student> students;

    StudentSystem() {
        students = new ArrayList<>();
    }

    public void addStudent(Student stud) {
        students.add(stud);
        System.out.println("Student added: " + stud.getStudentId());
    }

    public void removeViaID(String ID) {
        int prev = students.size();
        students.removeIf(n -> {
            if(ID.equalsIgnoreCase(n.getStudentId())){
                System.out.println("\nDeleted: ");
                System.out.println(n);
                return true;
            }
            return false;
        });
        int curr = students.size();

        if (prev == curr) {
            System.out.println("Invalid ID " + ID);
        }
    }

    public void searchViaName(String Name) {
        boolean flag = false;
        for (int i = 0; i < students.size(); i++) {
            if (Name.equalsIgnoreCase(students.get(i).getStudentName())) {
                System.out.println(students.get(i));
                flag = true;
            }
        }
        if(!flag){
            System.out.printf("\nStudent named with %s doesn't exists...\n", Name);
        }
    }

    public void displayAll() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }
}

public class Main {
    public static void main(String[] args) {
        StudentSystem school = new StudentSystem();
        school.addStudent(new Student("S001", "Ramesh", "CSE", 8.9));
        school.addStudent(new Student("S002", "Suresh", "ECE", 8.5));
        school.addStudent(new Student("S003", "Mahesh", "MECH", 8.7));
        school.addStudent(new Student("S004", "Rajesh", "CIVIL", 8.6));
        school.addStudent(new Student("S005", "Naresh", "EEE", 8.8));

        System.out.println("\n\nRemove Via ID");
        school.removeViaID("S005");
        school.removeViaID("S006");
        
        System.out.println("\n\nSearch Via Name");
        school.searchViaName("Mahesh");
        school.searchViaName("Kalesh");

        System.out.println("\n\nDisplay all students");
        school.displayAll();
    }
}