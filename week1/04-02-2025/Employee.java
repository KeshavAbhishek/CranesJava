import java.util.Scanner;

public class Employee {
    int empId;
    String empName;
    String empDesignation;
    int empSalary;
    String empDept;

    void read(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter EID: ");
        empId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        empName = sc.nextLine();
        
        System.out.print("Enter Desgination: ");
        empDesignation = sc.next();
        sc.nextLine();
        
        System.out.print("Enter Salary: ");
        empSalary = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Enter Department :");
        empDept = sc.next();
        
        sc.close();
    }

    void display(){
        System.out.println("\nEID: " + empId);
        System.out.println("Name: " + empName);
        System.out.println("Designation: " + empDesignation);
        System.out.println("Salary: " + empSalary);
        System.out.println("Department: " + empDept);
    }
    
    public static void main(String[] args){
        Employee e = new Employee();
        e.read();
        e.display();
    }
}