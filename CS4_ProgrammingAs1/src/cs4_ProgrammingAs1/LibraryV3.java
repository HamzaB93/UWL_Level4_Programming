package cs4_ProgrammingAs1;

public class LibraryV3
{
	//Variables
	int refNum;
	String bookName;
	String genre;
	String publisher;
	int publishYear;
	
	//Set method - Used later to change the default value of Variables
	public void set(int aRefNum, String aBookName, String aGenre, 
			String aPublisher, int aPublishYear)
	{
		refNum = aRefNum;
		bookName = aBookName;
		genre = aGenre;
		publisher = aPublisher;
		publishYear = aPublishYear;		
	}
	
	//Creating default values with the Set method
	public LibraryV3()
	{
		set(0000 , "Unknown" , "Unknown" , "Unknown" , 0000);
	}
	
	
	//Set method to create a constructor with parameters
	public LibraryV3(int aRefNum, String aBookName, String aGenre, 
			String aPublisher, int aPublishYear)
	{
		set(aRefNum , aBookName , aGenre , aPublisher , aPublishYear);
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
