import java.util.*;

class Data {
    long custId;
    String custName;
    String custCity;
    long mobileNumber;

    public void readCustomer(Scanner sc) {
        System.out.print("Enter CID: ");
        custId = sc.nextLong();
        sc.nextLine();

        System.out.print("Enter Name: ");
        custName = sc.nextLine();

        System.out.print("Enter customer city: ");
        custCity = sc.nextLine();

        System.out.print("Enter mobile number: ");
        mobileNumber = sc.nextLong();
        sc.nextLine();
    }

    public void display() {
        System.out.println();
        System.out.println("Customer ID: " + custId);
        System.out.println("Name: " + custName);
        System.out.println("City: " + custCity);
        System.out.println("Mobile: " + mobileNumber);
    }
}

public class Customer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Data[] users = new Data[5];

        for (int i = 0; i < 5; i++) {
            users[i] = new Data();
            users[i].readCustomer(sc);
        }

        System.out.println("\n--- Customer Details ---");
        for (int i = 0; i < 5; i++) {
            users[i].display();
        }

        sc.close();
    }
}