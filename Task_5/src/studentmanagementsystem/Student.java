package studentmanagementsystem;

import java.io.Serializable;

public class Student implements Serializable {
    
	private static final long serialVersionUID = 1L;

    private String name;
    private int rollNumber;
    private char grade;

    public Student(String name, int rollNumber, char grade) 
    {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }


    public String getName() 
    {
        return name;
    }

    public int getRollNumber() 
    {
        return rollNumber;
    }

    public char getGrade()
    {
        return grade;
    }

    @Override
    public String toString() 
    {
        return "Student{" + "name='" + name + '\'' + ", rollNumber=" + rollNumber + ", grade=" + grade + '}';
    }
}
