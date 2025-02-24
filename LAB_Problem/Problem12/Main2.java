package LAB_Problem.Problem12;

import java.util.ArrayList;

/**
 * ==========================================================
 * Program Name: Employee Management System
 * Description : Manage employee records, including adding, removing,
 *               and displaying employees with specific conditions.
 * Author      : Keshav Abhishek
 * Created On  : 22-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

class EmployeeDetails {
    int empId;
    String empName;
    String empDesg;
    double empSalary;
    String empDept;

    public EmployeeDetails(int empId, String empName, String empDesg, double empSalary, String empDept) {
        this.empId = empId;
        this.empName = empName;
        this.empDesg = empDesg;
        this.empSalary = empSalary;
        this.empDept = empDept;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpDesg() {
        return empDesg;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public String getEmpDept() {
        return empDept;
    }

    @Override
    public String toString() {
        return "Employee ID: " + empId + "\n" +
               "Employee Name: " + empName + "\n" +
               "Designation: " + empDesg + "\n" +
               "Salary: " + empSalary + "\n" +
               "Department: " + empDept + "\n";
    }
}

class EmployeeDatabase {
    ArrayList<EmployeeDetails> employees;

    public EmployeeDatabase() {
        employees = new ArrayList<>();
    }

    public void addEmployee(EmployeeDetails emp) {
        employees.add(emp);
        System.out.println("Employee added: " + emp.getEmpName());
    }

    public void removeEmployeeById(int empId) {
        boolean removed = employees.removeIf(emp -> {
            if (emp.getEmpId() == empId) {
                System.out.println("\nDeleted Employee: \n" + emp);
                return true;
            }
            return false;
        });

        if (!removed) {
            System.out.println("Invalid Employee ID: " + empId);
        }
    }

    public void displayHighSalaryEmployees() {
        System.out.println("\nEmployees with salary > 50000 in CSE Department:");
        boolean found = false;
        for (EmployeeDetails emp : employees) {
            if (emp.getEmpSalary() > 50000 && "CSE".equalsIgnoreCase(emp.getEmpDept())) {
                System.out.println(emp);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No employees found with salary > 50000 in CSE Department.");
        }
    }

    public void displayAllEmployees() {
        System.out.println("\nDisplaying All Employees:");
        for (EmployeeDetails emp : employees) {
            System.out.println(emp);
        }
    }
}

public class Main2 {
    public static void main(String[] args) {
        EmployeeDatabase company = new EmployeeDatabase();

        company.addEmployee(new EmployeeDetails(101, "Arjun", "Software Engineer", 60000, "CSE"));
        company.addEmployee(new EmployeeDetails(102, "Basant", "Data Scientist", 70000, "CSE"));
        company.addEmployee(new EmployeeDetails(103, "ChandaSuri", "HR Manager", 48000, "HR"));
        company.addEmployee(new EmployeeDetails(104, "Dharmendra", "Network Engineer", 55000, "IT"));
        company.addEmployee(new EmployeeDetails(105, "Eshan", "Professor", 52000, "CSE"));

        System.out.println("\nRemoving an Employee:");
        company.removeEmployeeById(104);
        company.removeEmployeeById(110);

        System.out.println("\nDisplaying High Salary Employees in CSE:");
        company.displayHighSalaryEmployees();

        System.out.println("\nDisplaying All Employees:");
        company.displayAllEmployees();
    }
}