public class NewStudentGrading {
    public static void main(String[] args) {
        String name = "Olonade Oluwanifemi";
        double score = 70.5;
        String grade = "";
        if (score >= 90){
            grade = "A = Pass";
        } else if (score >= 80) {
            grade = "B = Pass";
        } else if (score >= 70) {
            grade = "C = Pass";
        } else if (score >= 60) {
            grade = "D = Pass";
        } else {
            grade = "F = Fail";
        }
        System.out.println("Student Name: " + name);
        System.out.println("Score: " + score);
        System.out.println("Grade: " + grade);
        
    }
}
