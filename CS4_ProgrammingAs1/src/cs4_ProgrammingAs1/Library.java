package cs4_ProgrammingAs1;

import java.util.ArrayList;

import cs4_ProgrammingAs1.Book;

public class Library 
{
	//The array list will store contents of the Library class
	ArrayList<Book> library;
	//Adding another property to the array called keys
	ArrayList<String> keys;
	
	//Created a constructor. Has a container which holds items from the Library class
	public Library()
	{
		library = new ArrayList<Book>();
		keys = new ArrayList<String>();
	}
	
	//A will return the amount of books there are in the library
	public int getSize()
	{
		return library.size();
	}

	//Using the ask method so that user can enter their details
	public void add(Book aLibrary)
	{
		library.add(aLibrary);
		keys.add(aLibrary.getRefNum());
	}
	
	public Book find(String aRefNum)
	{
		int index = keys.indexOf(aRefNum);
		if(index == -1)
		{	
			return null;
		}
		else
		{
			return library.get(index);
		}
	}
	//Print method to show how many items/books there are in the
	// Libraries class
	public void print (String header)
	{
		System.out.println(header);
		//When i is 0, until it is less than Libraries, increment 
		//by 1, get the object and print it out
		for (int i=0; i < library.size(); i++)
			System.out.println(library.get(i));
	}
}
