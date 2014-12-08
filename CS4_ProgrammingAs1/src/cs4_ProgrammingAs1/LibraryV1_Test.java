package cs4_ProgrammingAs1;


public class LibraryV1_Test 
{
	public static void main(String[] args) 
	{
		//Creating a new object
		Library Library = new Library();
		
		Book libraries1 = new Book();
		//Using ask method from Library class
		libraries1.ask("Enter the book details: ");
		//Adding the new item into the libraries
		Library.add(libraries1);
		
		Book libraries2 = new Book();
		libraries2.ask("Enter the second book details: ");
		Library.add(libraries2);
		
		Library.print("Entered books");
		System.out.println("Number of books: " + Library.getSize());
	}
}
