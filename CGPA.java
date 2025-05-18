import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalGrades = 0.0;
        int numberOfSubjects = 5;

        System.out.println("Enter grades for " + numberOfSubjects + " subjects (on a scale of 4.0):");

        for (int i = 1; i <= numberOfSubjects; i++) {
            double grade;
            while (true) {
                System.out.print("Grade for subject " + i + ": ");
                grade = scanner.nextDouble();
                if (grade >= 0.0 && grade <= 4.0) {
                    break;
                } else {
                    System.out.println("Invalid grade! Please enter a value between 0.0 and 4.0.");
                }
            }
            totalGrades += grade;
        }

        double cgpa = totalGrades / numberOfSubjects;
        System.out.printf("Your CGPA is: %.2f%n", cgpa);

        scanner.close();
    }
}