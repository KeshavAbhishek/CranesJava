import java.util.Scanner;

class BankAccount {
    long accountNumber;
    double balance;

    public BankAccount(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(long accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        double intt = balance * interestRate / 100;
        balance = balance + intt;
        return intt;
    }

    public void debitAmount(double amount) {
        if (balance - amount < 0) {
            System.out.println("Error: Insufficient funds. Cannot debit amount.");
        } else {
            balance -= amount;
            System.out.println("Amount debited: " + amount);
            System.out.println("Balance Left: " + balance);
        }
    }

    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Interest Earned: " + calculateInterest());
    }
}

class CurrentAccount extends BankAccount {
    double overdraftLimit;

    public CurrentAccount(long accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void debitAmount(double amount) {
        if (amount > overdraftLimit) {
            System.out.println("Error: Overdraft limit exceeded. Cannot debit amount.");
        } else {
            balance -= amount;
            System.out.println("Amount debited: " + amount);
            System.out.println("Balance Left: " + balance);
        }
    }

    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}

public class BankSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Savings Account details:");
        System.out.print("Account Number: ");
        long savingsAccNumber = scanner.nextLong();
        System.out.print("Balance: ");
        double savingsBalance = scanner.nextDouble();
        System.out.print("Interest Rate: ");
        double interestRate = scanner.nextDouble();
        SavingsAccount savingsAccount = new SavingsAccount(savingsAccNumber, savingsBalance, interestRate);

        System.out.println("Enter Current Account details:");
        System.out.print("Account Number: ");
        long currentAccNumber = scanner.nextLong();
        System.out.print("Balance: ");
        double currentBalance = scanner.nextDouble();
        System.out.print("Overdraft Limit: ");
        double overdraftLimit = scanner.nextDouble();
        CurrentAccount currentAccount = new CurrentAccount(currentAccNumber, currentBalance, overdraftLimit);

        System.out.println("\nSavings Account Details:");
        savingsAccount.displayAccountDetails();
        savingsAccount.debitAmount(15000);

        System.out.println("\nCurrent Account Details:");
        currentAccount.displayAccountDetails();
        currentAccount.debitAmount(17000);

        scanner.close();
    }
}