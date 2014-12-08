package cs4_ProgrammingAs1;

public class BookV1
{
	//Variables
	int refNum;
	String bookName;
	String genre;
	String publisher;
	int publishYear;
	
	//Default constructor - giving default values to the variables
	public BookV1()
	{
		refNum = 0000;
		bookName = "Unknown";
		genre = "Unknown";
		publisher = "Unknown";
		publishYear = 0000;
	}

	//Print method - print out all the default values
	public void print()
	{
		System.out.println("Reference Number: " + refNum);
		System.out.println("Book Name: " + bookName);
		System.out.println("Genre: " + genre);
		System.out.println("Publisher: " + publisher);
		System.out.println("Published Year: " + publishYear);
	}
}