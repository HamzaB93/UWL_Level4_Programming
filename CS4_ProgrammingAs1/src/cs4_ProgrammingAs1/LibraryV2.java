package cs4_ProgrammingAs1;

//Imported ArrayList utility from java library
import java.util.ArrayList;

import cs4_ProgrammingAs1.Book;

public class LibraryV2 
{
	//ArrayList - The array list will store contents of the Library class
	ArrayList<Book> library;
	//ArrayList - Adding another property to the array called keys for use as an index
	ArrayList<String> keys;
	
	/*Created constructors - Has a container which holds items from the Library class
	 * Another container for keys which involve storing reference numbers
	 */
	public LibraryV2()
	{
		library = new ArrayList<Book>();
		keys = new ArrayList<String>();
	}
	
	//get.size method - will return a number of books stored in Library
	public int getSize()
	{
		return library.size();
	}

	/* Add method - after a the data is entered using the ask method, the data will be added
	 * library array. The reference number will be added to the keys array.
	 */
	
	public void add(Book aLibrary)
	{
		library.add(aLibrary);
		keys.add(aLibrary.getRefNum());
	}
	
	/*Find method - finds a reference number.
	 * If there is no reference number, return null
	 * Else get it from the library class
	 */
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
	
	/* Print method - to show how many items/books there are in the
	 * Libraries class
	 */
	public void print (String header)
	{
		System.out.println(header);
		/* When i is 0, until it is less than Libraries, increment 
		 * by 1, get the object and print it out
		 */
		for (int i=0; i < library.size(); i++)
			System.out.println(library.get(i));
	}
}
