import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int tm; // total marks
        int ts; // total subjects
        int am; // average marks
        char grade; // grade
        
        System.out.println("Enter total subjects: ");
        ts = scanner.nextInt();
        
        tm = 0; // Initialize total marks to 0
        
        // Loop to take input marks for each subject
        for (int i = 1; i <= ts; i++) {
            System.out.println("Enter marks for subject " + i + ": ");
            int marks = scanner.nextInt();
            tm += marks; // Add marks to total marks
        }
        
        // Calculate average marks
        am = tm / ts;
        
        // Assign grade based on average marks
        if (am >= 90) {
            grade = 'A';
        } else if (am >= 80) {
            grade = 'B';
        } else if (am >= 70) {
            grade = 'C';
        } else if (am >= 60) {
            grade = 'D';
        } else if (am >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }
        
        // Display total marks, average percentage, and grade
        System.out.println("Total Marks: " + tm);
        System.out.println("Average Percentage: " + am + "%");
        System.out.println("Grade: " + grade);
        
        scanner.close();
    }
}
