// Created by Jorden Burchick
// Data Structures and Algorithms, CPSC 374, Project 2 - Dr. Mullins.
// Student.java; basic student info - name, age, gpa.

public class Student
{
	private String fName, lName;
	private double gpa;
	private int age;

	public Student()
	{ }
	
	public Student(String l, String f, double g, int a)
	{ 
		lName = l;
		fName = f;
		gpa = g;
		age = a;
	}
	
	@Override
	public String toString()
	{
		return "[" + age + ", " + gpa + ", " + lName + ", " + fName + "] ";
	}
}
