package studentmanagementsystem;

import java.util.Scanner;

public class ConsoleUI 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        StudentManagementSystem system = new StudentManagementSystem();

        while (true)
        {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search for Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");

            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();

            switch (choice) 
            {
                case 1:
                    addStudent(system, scanner);
                    break;
                case 2:
                    removeStudent(system, scanner);
                    break;
                case 3:
                    searchStudent(system, scanner);
                    break;
                case 4:
                    system.displayAllStudents();
                    break;
                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }

    private static void addStudent(StudentManagementSystem system, Scanner scanner) 
    {
        System.out.print("Enter student name: ");
        String name = scanner.next();

        System.out.print("Enter student roll number: ");
        int rollNumber = scanner.nextInt();

        System.out.print("Enter student grade: ");
        char grade = scanner.next().charAt(0);

        Student student = new Student(name, rollNumber, grade);
        system.addStudent(student);

        System.out.println("Student added successfully.");
    }

    private static void removeStudent(StudentManagementSystem system, Scanner scanner) 
    {
        System.out.print("Enter roll number of the student to remove: ");
        int rollNumber = scanner.nextInt();
        system.removeStudent(rollNumber);
    }

    private static void searchStudent(StudentManagementSystem system, Scanner scanner) 
    {
        System.out.print("Enter roll number of the student to search: ");
        int rollNumber = scanner.nextInt();
        Student student = system.searchStudent(rollNumber);

        if (student != null) 
        {
            System.out.println("Student found: " + student);
        } else 
        {
            System.out.println("Student not found.");
        }
    }
}

