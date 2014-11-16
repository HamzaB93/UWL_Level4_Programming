package cs4_ProgrammingAs1;

public class LibraryV2_Test 
{
	public static void main(String[] args) 
	{
		System.out.println("Testing LibraryV2");
		
		//Default constructor is called in
		//Created and object called test1
		Library test1 = new Library();
		
		//Using the print method made in Library
		test1.print();
		
		System.out.println("\n");
		
		//Constructor with parameters is called in
		//Creating another object called test2
		Library test2 = new Library(6628 , "Computer Science", "Education"
				, "UWL", 2014);
		
		test2.print();
	}
}
