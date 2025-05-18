import java.util.InputMismatchException;
import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 0.0;


        while (true) {
            try {
                System.out.print("Enter your current account balance: $");
                balance = scanner.nextDouble();
                if (balance < 0) {
                    System.out.println("Balance cannot be negative. Please try again.");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); 
            }
        }


        while (true) {
            try {
                System.out.print("Enter deposit amount: $");
                double deposit = scanner.nextDouble();
                if (deposit < 0) {
                    System.out.println("Deposit amount cannot be negative. Please try again.");
                    continue;
                }
                balance += deposit;
                System.out.printf("Updated balance: $%.2f%n", balance);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); 
            }
        }

        scanner.close();
    }
}
//explain access modifiers in java
// Access modifiers in Java are keywords that set the accessibility (visibility) of classes, methods, and other members. They control where these members can be accessed from. The four main access modifiers in Java are: