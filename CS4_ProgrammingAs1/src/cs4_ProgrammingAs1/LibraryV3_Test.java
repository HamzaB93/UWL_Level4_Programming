package cs4_ProgrammingAs1;

public class LibraryV3_Test 
{
	public static void main(String[] args) 
	{
		System.out.println("Testing LibraryV3");
		
		//Using the default values and printing them
		LibraryV3 test1 = new LibraryV3();
		System.out.println("Test1 is:");
		test1.print();
		
		System.out.println("\n");
		
		//Now using the set method to mutate the default values and print them out
		test1.set(1663, "Architecture","Education", "Harvard", 2002);
		System.out.println("Test1 is now:");
		test1.print();
		
		System.out.println("\n");
		
		//Using parameterised constructor
		LibraryV3 test2 = new LibraryV3(6628 , "Computer Science", "Education"
				, "UWL", 2014);
		
		test2.print();
	}
}
