package cs4_ProgrammingAs1;

public class LibraryV2
{
	//Variables
	int refNum;
	String bookName;
	String genre;
	String publisher;
	int publishYear;
	
	//Default constructor - giving default values to the variables
	public LibraryV2()
	{
		refNum = 0000;
		bookName = "Unknown";
		genre = "Unknown";
		publisher = "Unknown";
		publishYear = 0000;
	}

	//Creating a constructor with parameters
	public LibraryV2(int aRefNum, String aBookName, String aGenre, 
			String aPublisher, int aPublishYear)
	{
		refNum = aRefNum;
		bookName = aBookName;
		genre = aGenre;
		publisher = aPublisher;
		publishYear = aPublishYear;
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
