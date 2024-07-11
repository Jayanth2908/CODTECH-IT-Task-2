import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> grades = new ArrayList<>();

        System.out.println("Welcome to the Student Grade Tracker!");

        boolean continueAdding = true;

        // Loop to continuously add grades until user chooses to stop
        while (continueAdding) {
            System.out.print("Enter a grade (or -1 to finish): ");
            double grade = scanner.nextDouble();

            if (grade == -1) {
                continueAdding = false;
            } else {
                grades.add(grade);
            }
        }

        // Calculate average grade
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        double averageGrade = sum / grades.size();

        // Display overall grade and additional information
        System.out.println("\n===== Grade Summary =====");
        System.out.printf("Number of grades: %d\n", grades.size());
        System.out.printf("Average grade: %.2f\n", averageGrade);

        // Determine and display letter grade
        char letterGrade = calculateLetterGrade(averageGrade);
        System.out.printf("Letter grade: %c\n", letterGrade);

        // Determine and display GPA (assuming simple mapping for demonstration)
        double gpa = calculateGPA(letterGrade);
        System.out.printf("GPA: %.2f\n", gpa);

        scanner.close();
    }

    // Method to calculate letter grade based on average grade
    public static char calculateLetterGrade(double averageGrade) {
        if (averageGrade >= 90) {
            return 'A';
        } else if (averageGrade >= 80) {
            return 'B';
        } else if (averageGrade >= 70) {
            return 'C';
        } else if (averageGrade >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    // Method to calculate GPA based on letter grade (for demonstration purposes)
    public static double calculateGPA(char letterGrade) {
        switch (letterGrade) {
            case 'A':
                return 4.0;
            case 'B':
                return 3.0;
            case 'C':
                return 2.0;
            case 'D':
                return 1.0;
            default:
                return 0.0;
        }
    }
}
