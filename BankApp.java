import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Initial account balance
        System.out.print("Enter your current account balance: ");
        double balance = scanner.nextDouble(); // Corrected this line
        
        // Prompt for deposit amount
        System.out.print("Enter the amount to deposit: ");
        double deposit = scanner.nextDouble();
        
        // Update balance
        balance += deposit;
        
        // Display updated balance
        System.out.printf("Your updated account balance is: %.2f%n", balance);
        
        // Close the scanner
        scanner.close();
    }
}
