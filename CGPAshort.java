import java.util.Scanner;

public class CGPAshort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        System.out.println("Enter grades for 5 subjects (0.0 to 4.0):");
        for (int i = 1; i <= 5; i++) {
            double grade;
            do {
                System.out.print("Subject " + i + ": ");
                grade = scanner.nextDouble();
            } while (grade < 0.0 || grade > 4.0);
            total += grade;
        }
        System.out.printf("Your CGPA is: %.2f%n", total / 5);
        scanner.close();
    }
}