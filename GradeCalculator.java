import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input number of subjects
        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        int totalMarks = 0;

        // Input marks for each subject
        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = sc.nextInt();

            totalMarks = totalMarks + marks;
        }

        // Calculate average percentage
        double percentage = (double) totalMarks / subjects;

        // Grade calculation
        String grade;

        if (percentage >= 90) {
            grade = "A+";
        } 
        else if (percentage >= 80) {
            grade = "A";
        } 
        else if (percentage >= 70) {
            grade = "B";
        } 
        else if (percentage >= 60) {
            grade = "C";
        } 
        else if (percentage >= 50) {
            grade = "D";
        } 
        else {
            grade = "F";
        }

        // Display results
        System.out.println("\n----- RESULT -----");
        System.out.println("Total Marks = " + totalMarks);
        System.out.println("Average Percentage = " + percentage);
        System.out.println("Grade = " + grade);

        sc.close();
    }
}