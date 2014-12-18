package cs4_ProgrammingAs1;

public class StockV4 
{
	public static void main(String[] args) 
	{
		//Creating an object - called stock using library class
		Library stock = new Library();
		
		//Using methods from the Book class
		Book library;
		
		//Define a default boolean called finish and assigned it as false
		boolean finished = false;
		
		//Defined a variable option which accepts a character only
		char option;
		
		System.out.println("Welcome To The Book Entry Sytsem For Your Library. Options Are Shown Below\n ");
		//Menu loop
		//When the menu is not closed/finished/exited
		while( ! finished )
		{	
			//Using console to ask for a character value stored in option
			option = Console.askOption("Enter A to Add , P to Print or Q to Quit\n");
			
			//Switch - determines what happens when a certain value is stored in option
			switch (option)
			{
			//When option = a/A
			case 'A':
				//Create a new object
				library = new Book();
				
				//Ask method - ask for the book details
				library.ask("Enter book details: ");
				
				/*Using getRefNum and find method, 
				 * If book refNumber is present, give an error
				 */
				if (stock.find(library.getRefNum() ) != null)
				{	
					System.out.println("ERROR! Another book has this reference number. \n");
				}	
				
				//Else add that to the library
				else
				{	
					stock.add(library);
				}
				break;
			
			//When option = p/P	
			case 'P':
				//Print the size of the array/ number of books in the stock class with getSize
				System.out.println("Number of books: " + stock.getSize());
				
				//print all the books in the stock using print method
				stock.print("Books:");
				break;
			
			//When option = q/Q
			case 'Q':
				//Change finished to true and close the program
				finished = true;
				break;
			 
			//When option is none of the above, do nothing	
			case '\0':
				break;
			
			//Otherwise the input is wrong and an error message appears.	
			default:
				System.out.println("ERROR! Enter either A , P or Q\n");
				break;
			}
		}
		
	}
}
