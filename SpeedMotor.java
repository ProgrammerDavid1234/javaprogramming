import java.util.Scanner;

public class SpeedMotor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a gear number (0 to 5): ");
        int gear = scanner.nextInt();

        if (gear == 0) {
            System.out.println("The car will not move.");
        } else if (gear == 1) {
            System.out.println("The car will start moving gradually.");
        } else if (gear == 2 || gear == 3 || gear == 4) {
            System.out.println("The car’s speed will now increase.");
        } else if (gear == 5) {
            System.out.println("Gear 5 is not available in the car gear operation.");
        } else {
            System.out.println("Invalid input. Please enter a gear number between 0 and 5.");
        }

        scanner.close();
    }
}
