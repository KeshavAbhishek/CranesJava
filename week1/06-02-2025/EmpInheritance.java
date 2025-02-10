class Employee{
    int employeeId;
    String name;
    String department;

    Employee(){}
    Employee(int employeeId, String name, String department){
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
    }

    void displayDetails(){
        System.out.println("Employee ID: " + this.employeeId);
        System.out.println("Name: : " + this.name);
        System.out.println("Department: " + this.department);
    }
}

class Manager extends Employee{
    int teamSize;
    Manager(){}
    Manager(int teamSize){
        super(1, "Sourav", "Sales");
        this.teamSize = teamSize;
    }
    void displayDetails(){
        System.out.println("Employee ID: " + this.employeeId);
        System.out.println("Name: : " + this.name);
        System.out.println("Department: " + this.department);
        System.out.println("Team size: " + this.teamSize);
    }
}


public class EmpInheritance {
    public static void main(String[] args) {
        Manager m = new Manager(5);
        m.displayDetails();
    }
}