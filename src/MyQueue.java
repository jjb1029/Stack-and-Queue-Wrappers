// Created by Jorden Burchick
// Data Structures and Algorithms, CPSC 374, Project 2 - Dr. Mullins.
// MyQueue.java; Using a linked list to create a queue, "wrapper" class.

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class MyQueue<T>
{
	private LinkedList<T> ll = new LinkedList<T>();
	
	public MyQueue()
	{	}
	
	public void insert(T elem)
	{
		ll.addLast(elem);
	}
	
	public T remove() throws Exception
	{
		if(!isEmpty())
			return ll.removeFirst();
		else
			throw new NoSuchElementException("No such element.");
	}
	
	public T peek() throws Exception
	{
		if(!isEmpty())
			return ll.peekFirst();
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
