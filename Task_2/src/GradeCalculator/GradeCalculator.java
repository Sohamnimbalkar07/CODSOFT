package GradeCalculator;

import java.util.Scanner;

public class GradeCalculator 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Grade Calculator");
        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = scanner.nextInt();

  
        while (numberOfSubjects <= 0) 
        {
            System.out.println("Invalid input. Please enter a positive number of subjects.");
            System.out.print("Enter the number of subjects: ");
            numberOfSubjects = scanner.nextInt();
        }

        int totalMarks = 0;
        for (int i = 1; i <= numberOfSubjects; i++) 
        {
            System.out.print("Enter marks for Subject " + i + " (out of 100): ");
            int marks = scanner.nextInt();

            while (marks < 0 || marks > 100) 
            {
                System.out.println("Invalid input. Marks should be between 0 and 100.");
                System.out.print("Enter marks for Subject " + i + " (out of 100): ");
                marks = scanner.nextInt();
            }

            totalMarks += marks;
        }

 
        double averagePercentage = (double) totalMarks / numberOfSubjects;

  
        char grade = calculateGrade(averagePercentage);

        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }

    private static char calculateGrade(double averagePercentage) 
    {
        if (averagePercentage >= 90) 
        {
            return 'A';
        } else if (averagePercentage >= 80) 
        {
            return 'B';
        } else if (averagePercentage >= 70) 
        {
            return 'C';
        } else if (averagePercentage >= 60) 
        {
            return 'D';
        } else 
        {
            return 'F';
        }
    }
}

