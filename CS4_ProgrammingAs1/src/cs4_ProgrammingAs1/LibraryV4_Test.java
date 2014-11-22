package cs4_ProgrammingAs1;

import java.util.concurrent.SynchronousQueue;

public class LibraryV4_Test 
{
	public static void main(String[] args) 
	{
		//Creating new object with parameters
		LibraryV4 test4 = new LibraryV4(101 , "Computers" , "Education"
				, "Oxford", 2014 , 5);
		test4.print();
		
		System.out.println("\n");
		
		//Using the get method to access the refnumber and the stock
		System.out.println("Reference Number: " + test4.getRefNum());
		System.out.println("Book Name: " + test4.getBookName());
		//Getting the stock again so it can be modified
		int stock = test4.getStock();
		System.out.println("Stock: " +stock);
		
		System.out.println("\n");
		
		//The stock will be changed
		test4.setStock(stock - 3);
		
		System.out.println("The stock has changed\n");
		test4.print();
		
		
	}
}
