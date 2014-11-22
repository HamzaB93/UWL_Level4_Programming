package cs4_ProgrammingAs1;

public class LibraryV5_Test 
{
	public static void main(String[] args) 
	{
		//Creating objects using the ask method
		//The method will allow the user to enter their own values
		LibraryV5 test5_1 = new LibraryV5();
		test5_1.ask("Enter the first book\n");
		
		LibraryV5 test5_2 = new LibraryV5();
		test5_2.ask("Enter the second book\n");
		
		LibraryV5 test5_3 = new LibraryV5();
		test5_3.ask("Enter the third book\n");
		
		//Printing out the new objects
		test5_1.print();
		test5_2.print();
		test5_3.print();
	}
}
