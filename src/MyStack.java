// Created by Jorden Burchick.
// Data Structures and Algorithms, CPSC 374, Project 2 - Dr. Mullins.
// MyStack.java; Using a linked list to create a stack, "wrapper" class.

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class MyStack<T>
{
	private LinkedList<T> ll = new LinkedList<T>();
	
	public MyStack()
	{	}
	
	public void push(T elem)
	{
		ll.add(elem);
	}
	
	public T pop() throws Exception
	{
		if(!isEmpty())
			return ll.removeLast();
		else
			throw new NoSuchElementException("No such element.");
	}
	
	public T peek() throws Exception
	{
		if(!isEmpty())
			return ll.peekLast();
		else
			throw new NoSuchElementException("No such element.");
	}
	
	public boolean isEmpty()
	{
		return (ll.isEmpty());
	}
	
	@Override
	public String toString()
	{
		String allElems = "[";
		for(T elem : ll)
			allElems += elem;

		allElems += "]";
		return allElems;
	}
}
