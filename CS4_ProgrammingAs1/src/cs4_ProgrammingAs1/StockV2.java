package cs4_ProgrammingAs1;

public class StockV2 
{
	public static void main(String[] args) 
	{
		Library stock = new Library();
		
		Book library;
		
		boolean finished = false;
		
		char option;
		
		while( ! finished )
		{
			option = Console.askOption(" A - Add , P - Print, Q - Quit");
			switch (option)
			{
			case 'A':
				library = new Book();
				library.ask("Enter book details: ");
				
				if (stock.find(library.getRefNum() ) != null)
				{	
					System.out.println("Error Book exists");
				}	
				else
				{	
					//library.ask("Enter book details: ");
					stock.add(library);
				}
				break;
				
			case 'P':
				stock.print("Books:");
				break;
			
			case 'Q':
				finished = true;
				break;
				
			case '\0':
				break;
			
			default:
				System.out.println("ERROR, wrong input");
				break;
			}
		}
		
	}
}
