package studentmanagementsystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentManagementSystem 
{
    private List<Student> students;

    public StudentManagementSystem() 
    {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) 
    {
        students.add(student);
    }

    public void removeStudent(int rollNumber) 
    {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getRollNumber() == rollNumber) 
            {
                iterator.remove();
                System.out.println("Student removed successfully.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public Student searchStudent(int rollNumber) 
    {
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) 
            {
                return student;
            }
        }
        return null;
    }

    public void displayAllStudents() 
    {
        for (Student student : students)
        {
            System.out.println(student);
        }
    }
}
