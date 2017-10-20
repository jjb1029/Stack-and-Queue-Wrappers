// Created by Jorden Burchick
// Data Structures and Algorithms, CPSC 374, Project 2 - Dr. Mullins.
// driver.java; Utilizes our FileProcessor and wrapper classes.

import java.util.NoSuchElementException;

public class driver
{
	public static void main(String args[])
	{
		MyStack<Student> myS = new MyStack<Student>();
		MyQueue<Student> myQ = new MyQueue<Student>();
		new FileProcessor("input.txt", myS, myQ);
		
		System.out.println("THE STACK DATA STRUCT:");
		System.out.println(myS.toString());
		System.out.println("THE QUEUE DATA STRUCT:");
		System.out.println(myQ.toString());
		
		try
		{
			System.out.println("TOP IS: " + myS.peek());
			System.out.println("FRONT IS: " + myQ.peek());
		
			while(!myS.isEmpty())
				System.out.println("ST: " + myS.pop());
		
			while(!myQ.isEmpty())
				System.out.println("Q: " + myQ.remove());
		} 
		catch (NoSuchElementException ex)
		{
			System.err.println("No such element exception occurred.");
		}
		catch (Exception ex)
		{
			System.err.println("Something went wrong.");
		}
	}
}
