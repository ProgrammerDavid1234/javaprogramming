import java.util.Scanner;

public class CGPACalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt(); 

        double totalGradePoints = 0;

        for (int i = 1; i <= numSubjects; i++) { 
            System.out.print("Enter grade points for subject " + i + " (0 to 10): ");
            double grade = scanner.nextDouble(); 

            if (grade < 0 || grade > 10) {
                System.out.println("Invalid grade! Please enter a value between 0 and 10.");
                i--; 
            } else {
                totalGradePoints += grade;
            }
        }

        double cgpa = totalGradePoints / numSubjects; 
        System.out.println("Your CGPA is: " + cgpa);

        if (cgpa >= 9) {
            System.out.println("Grade: Outstanding");
        } else if (cgpa >= 8) {
            System.out.println("Grade: Excellent");
        } else if (cgpa >= 7) {
            System.out.println("Grade: Very Good");
        } else if (cgpa >= 6) {
            System.out.println("Grade: Good");
        } else if (cgpa >= 5) {
            System.out.println("Grade: Satisfactory");
        } else {
            System.out.println("Grade: Fail");
        }

        scanner.close(); 
    }
}
/*
Corrected the class name (CGPACalculatopublic to CGPACalculator)

Added missing main method declaration and braces

Fixed Scanner instantiation (Scanners to Scanner)

Corrected variable declaration (numSubjects)

Repaired the for loop condition (? → i <= numSubjects)

Fixed incorrect scannerxxx.nextDouble() to scanner.nextDouble()

Used double for cgpa instead of String

Closed the scanner properly
*/
