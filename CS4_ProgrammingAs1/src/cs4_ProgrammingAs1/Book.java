package cs4_ProgrammingAs1;

public class Book
{
	//Variables
	String refNum;
	String bookName;
	String genre;
	String publisher;
	int publishYear;
	int stock; //added 
	
	
	//Set method - Used later to change the default value of Variables
	public void set(String aRefNum, String aBookName, String aGenre, 
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
	public Book()
	{
		set("0000" , "Unknown" , "Unknown" , "Unknown" , 0000, 2);
	}
	
	
	//Set method to create a constructor with parameters
	public Book(String aRefNum, String aBookName, String aGenre, 
			String aPublisher, int aPublishYear, int aStock)
	{
		set(aRefNum , aBookName , aGenre , aPublisher , aPublishYear, aStock);
	}	
	
	
	//Set individual data members so details can be changed
	public void setRefNum (String aRefNum)
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
	public String getRefNum()
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
	
	public boolean hasRefNum(String aRefNum)
	{
		return refNum.equals(aRefNum);
	}
	
	//Ask method using the console class. Will allow users to enter their own values
	// These values will be using the set method also
	public void ask(String prompt)
	{
		System.out.println("Enter the details of the book\n");
		setRefNum (Console.askString("Enter the book's reference number: "));
		setBookName (Console.askString("Enter the name of the book: "));
		setGenre (Console.askString("Enter the books genre: "));
		setPublisher (Console.askString("Enter the name of the publisher: "));
		setPublishYear (Console.askInt("Enter year the book was published: "));
		setStock (Console.askInt("Enter the the stock: "));
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
	
	public String toString()
	{
		return refNum +" "+ bookName +" "+ genre + publisher +
				" "+ publishYear +" "+ stock;
	}
}
