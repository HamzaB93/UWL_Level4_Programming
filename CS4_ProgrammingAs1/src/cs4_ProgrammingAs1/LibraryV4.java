package cs4_ProgrammingAs1;

public class LibraryV4
{
	//Variables
	int refNum;
	String bookName;
	String genre;
	String publisher;
	int publishYear;
	int stock; //added 
	
	
	//Set method - Used later to change the default value of Variables
	public void set(int aRefNum, String aBookName, String aGenre, 
			String aPublisher, int aPublishYear, int aStock)
	{
		refNum = aRefNum;
		bookName = aBookName;
		genre = aGenre;
		publisher = aPublisher;
		publishYear = aPublishYear;
		stock = aStock;
	}
	
	
	//Creating default values with the Set method
	public LibraryV4()
	{
		set(0000 , "Unknown" , "Unknown" , "Unknown" , 0000, 2);
	}
	
	
	//Set method to create a constructor with parameters
	public LibraryV4(int aRefNum, String aBookName, String aGenre, 
			String aPublisher, int aPublishYear, int aStock)
	{
		set(aRefNum , aBookName , aGenre , aPublisher , aPublishYear, aStock);
	}	
	
	
	//Set individual data members so details can be changed
	public void setRefNum (int aRefNum)
	{
		refNum = aRefNum; 
	}
	public void setBookName(String aBookName)
	{
		bookName= aBookName; 
	}
	public void setGenre (String aGenre)
	{
		genre = aGenre; 
	}
	public void setPublisher(String aPublisher)
	{
		publisher = aPublisher; 
	}
	public void setPublishYear(int aPublishYear)
	{
		publishYear = aPublishYear; 
	}
	public void setStock(int aStock)
	{
		stock = aStock; 
	}
	//Accessor methods. Will allow data to be provided to other classes
	public int getRefNum()
	{
		return refNum;
	}
	public String getBookName()
	{
		return bookName;
	}
	public String getGenre()
	{
		return genre;
	}
	public String getPublisher()
	{
		return publisher;
	}
	public int getPublishYear()
	{
		return publishYear;
	}
	public int getStock()
	{
		return stock;
	}
	
	
	//Print method - print out all the default values
	public void print()
	{
		System.out.println("Reference Number: " + refNum);
		System.out.println("Book Name: " + bookName);
		System.out.println("Genre: " + genre);
		System.out.println("Publisher: " + publisher);
		System.out.println("Published Year: " + publishYear);
		System.out.println("Stock: " + stock);
	}
}
