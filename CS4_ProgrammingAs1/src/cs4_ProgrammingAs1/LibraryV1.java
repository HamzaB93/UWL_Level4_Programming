package cs4_ProgrammingAs1;

import java.util.ArrayList;

import cs4_ProgrammingAs1.Book;

public class LibraryV1 
{
	//The array list will store contents of the Library class
	ArrayList<Book> Libraries;
	
	
	//Created a constructor. Has a container which holds items from the Library class
	public LibraryV1()
	{
		Libraries = new ArrayList<Book>();
	}
	
	//A will return the amount of books there are in the library
	public int getSize()
	{
		return Libraries.size();
	}

	//Using the ask method so that user can enter their details
	public void add(Book aLibrary)
	{
		Libraries.add(aLibrary);
	}
	
	//Print method to show how many items/books there are in the
	// Libraries class
	public void print (String header)
	{
		System.out.println(header);
		//When i is 0, until it is less than Libraries, increment 
		//by 1, get the object and print it out
		for (int i=0; i < Libraries.size(); i++)
			System.out.println(Libraries.get(i));
	}
}
