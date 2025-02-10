import java.util.Scanner;

/**
 * ==========================================================
 * Program Name: Employee
 * Description :
 * Author : Keshav Abhishek
 * Created On : 08-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

class EmployeeDetails {
    int empID;
    String empName;
    Scanner sc = new Scanner(System.in);

    EmployeeDetails() {}

    EmployeeDetails(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
    }

    void addEmp(EmployeeDetails[] emp) {
        int eid;
        String ename;
        for (int i = 0; i < emp.length; i++) {
            System.out.print("Enter emp id: ");
            eid = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter emp name: ");
            ename = sc.nextLine();
            emp[i] = new EmployeeDetails(eid, ename);
        }
    }

    void display(EmployeeDetails[] emp) {
        for (int i = 0; i < emp.length; i++) {
            System.out.println("ID: " + emp[i].empID);
            System.out.println("Name: " + emp[i].empName);
        }
    }

    void search(EmployeeDetails[] emp) {
        int eid;
        boolean found = false;
        System.out.print("Enter emp id: ");
        eid = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < emp.length; i++) {
            if (emp[i].empID == eid) {
                System.out.println("Emp id: " + emp[i].empID);
                System.out.println("Emp name: " + emp[i].empName);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Employee not found.");
        }
    }

    void update(EmployeeDetails[] emp) {
        int eid;
        String ename;
        boolean found = false;
        System.out.print("Enter emp id: ");
        eid = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < emp.length; i++) {
            if (emp[i].empID == eid) {
                System.out.print("Enter new emp name: ");
                ename = sc.nextLine();
                emp[i].empName = ename;
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Employee not found.");
        }
    }
}

public class Employee {
    public static void main(String[] args) {
        EmployeeDetails[] emp = new EmployeeDetails[2];
        EmployeeDetails e = new EmployeeDetails();
        System.out.println("\n\nAdding emp details:\n");
        e.addEmp(emp);
        System.out.println("\n\nDisplaying emp details:\n");
        e.display(emp);
        System.out.println("\n\nSearching emp details:\n");
        e.search(emp);
        System.out.println("\n\nUpdate emp details:\n");
        e.update(emp);
        System.out.println("\n\nDisplaying Updated One\n");
        e.display(emp);
        e.sc.close();
    }
}