public class Measurement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueConversion = true;

        while (continueConversion) {
            System.out.print("Enter a value in meters: ");
            double meters = scanner.nextDouble();

            double kilometers = meters / 1000;
            double centimeters = meters * 100;
            double millimeters = meters * 1000;

            System.out.println("Converted values:");
            System.out.printf("Kilometers: %.3f km%n", kilometers);
            System.out.printf("Centimeters: %.2f cm%n", centimeters);
            System.out.printf("Millimeters: %.2f mm%n", millimeters);

            System.out.print("Do you want to perform another conversion? (yes/no): ");
            String response = scanner.next().trim().toLowerCase();
            if (!response.equals("yes")) {
                continueConversion = false;
            }
        }
