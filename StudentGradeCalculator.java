import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in))
        {
        System.out.println("Enter the marks obtained in each subject out of 100:");
        System.out.print("MATHS: ");
        int subject1 = scanner.nextInt();
        System.out.print("SCIENCE: ");
        int subject2 = scanner.nextInt();
        System.out.print("ENGLISH: ");
        int subject3 = scanner.nextInt();
        System.out.print("HISTORY: ");
        int subject4 = scanner.nextInt();
        System.out.print("HINDI: ");
        int subject5 = scanner.nextInt();

        int totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;
        double averagePercentage = (double) totalMarks / 5;

        String grade = "";
        if (averagePercentage >= 90) {
            grade = "A+";
        } 
        else if (averagePercentage >= 80) {
            grade = "A";
        }
         else if (averagePercentage >= 70) {
            grade = "B+";
        }
         else if (averagePercentage >= 60) {
            grade = "B";
        }
         else if (averagePercentage >= 50) {
            grade = "C";
        }
         else {
            grade = "F";
        }

        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + String.format("%.2f", averagePercentage) + "%");
        System.out.println("Grade: " + grade);
    }
}
}
