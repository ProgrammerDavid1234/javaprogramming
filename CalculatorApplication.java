
import java.util.Scanner;

public class CalculatorApplication{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Please enter the second number:");
        double num2 = scanner.nextDouble();
        double add = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + add);
        
        scanner.close();
    }
}