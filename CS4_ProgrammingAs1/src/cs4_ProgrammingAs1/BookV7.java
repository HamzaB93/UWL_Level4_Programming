package cs4_ProgrammingAs1;

public class BookV7
{
	//Variables
	String refNum; // Reference number
	String bookName; // Book name
	String genre; // Genre
	String publisher; // Publisher name
	int publishYear; // Published year
	int stock; // Stock 
	
	
	//Set method - Used later to change the default value of Variables
	public void set(String aRefNum, String aBookName, String aGenre, 
			String aPublisher, int aPublishYear, int aStock)
	{
		//The parameters are associated with the variables defined above
		refNum = aRefNum; 
		bookName = aBookName;
		genre = aGenre;
		publisher = aPublisher;
		publishYear = aPublishYear;
		stock = aStock;
	}
	
	
	//Set method - creating default values with the 
	public BookV7()
	{	//refNum	, bookName	, genre		, publisher, year, 	stock
		set("0000" , "Unknown" , "Unknown" , "Unknown" , 0000, 2);
		/*The values are default. If using the method on its own,
		 * these values will be used.
		 */
		
	}
	
	
	//Set method - creating a constructor with parameters
	public BookV7(String aRefNum, String aBookName, String aGenre, 
			String aPublisher, int aPublishYear, int aStock)
	{
		set(aRefNum , aBookName , aGenre , aPublisher , aPublishYear, aStock);
	}	
	
	
	//Set individual data members -  details can be altered individually
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
	//Accessor methods - allows data to be provided to other classes
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
	
	/*The boolean checks if a reference number entered is already present.
	 * Used later to compare if the reference number entered is already present
	 * array list
	 */
	
	public boolean hasRefNum(String aRefNum)
	{
		return refNum.equals(aRefNum);
	}
	
	/*Ask method - using the console class. Will allow users to enter their own values
	*These values will be using the set method also
	*/
	public void ask(String prompt)
	{
		System.out.println("");
		System.out.println("Enter The Details Of The Book\n");
		setRefNum (Console.askString("Enter The Book's Reference Number: "));
		setBookName (Console.askString("Enter The Name Of The Book: "));
		setGenre (Console.askString("Enter The Book's Genre: "));
		setPublisher (Console.askString("Enter The Name Of The Publisher: "));
		setPublishYear (Console.askInt("Enter Year The Book Was Published: "));
		setStock (Console.askInt("Enter The Stock: \n"));
	}
	
	//Print method - prints out values that have been either mutated or are default
	public void print()
	{
		System.out.println("Reference Number: " + refNum);
		System.out.println("Book Name: " + bookName);
		System.out.println("Genre: " + genre);
		System.out.println("Publisher: " + publisher);
		System.out.println("Published Year: " + publishYear);
		System.out.println("Stock: " + stock);
	}
	
	/*toString method- prints out strings and variables in a cleaner way.
	 * Is used later when printing the details in the Library array class.
	 */
	public String toString()
	{
		return "Reference No: " + refNum +"; Book Name: "+ bookName +"; Genre:"+ genre +"; Publisher:"+publisher+
				"; Published Year: "+ publishYear +"; Stock: "+ stock + "\n";
	}
}
