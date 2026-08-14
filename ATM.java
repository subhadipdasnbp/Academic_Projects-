import java.util.Scanner;

public class ATM {
    double balance = 5000;
    Scanner scanner = new Scanner(System.in);
    public void checkBalance() {
        System.out.println("Your current balance is: Rs. " + balance);
    }

    // Method to deposit money
    public void deposit() {
        System.out.print("Enter amount to deposit: Rs. ");
        double amount = scanner.nextDouble();

        if (amount > 0) {
            balance = balance + amount;

            System.out.println("Deposit successful.");
            System.out.println("New balance: Rs. " + balance);
        } else {
            System.out.println("Invalid amount.");
        }
    }
    public void withdraw() {
        System.out.print("Enter amount to withdraw: Rs. ");
        double amount = scanner.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance = balance - amount;

            System.out.println("Withdrawal successful.");
            System.out.println("Remaining balance: Rs. " + balance);
        }
    }
    public void start() {
        int choice;

        do {
            System.out.println("\n======================");
            System.out.println("      ATM SYSTEM");
            System.out.println("======================");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    checkBalance();
                    break;

                case 2:
                    deposit();
                    break;

                case 3:
                    withdraw();
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);
    }
    public static void main(String[] args) {

        ATM atm = new ATM();

        atm.start();
    }
}