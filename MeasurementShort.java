import java.util.Scanner;

public class MeasurementShort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a value in meters (or type 'exit' to quit): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            try {
                double meters = Double.parseDouble(input);
                System.out.printf("Kilometers: %.3f%n", meters / 1000);
                System.out.printf("Centimeters: %.2f%n", meters * 100);
                System.out.printf("Millimeters: %.2f%n", meters * 1000);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numeric value.");
            }
        }
        scanner.close();
        System.out.println("Goodbye!");
    }
}