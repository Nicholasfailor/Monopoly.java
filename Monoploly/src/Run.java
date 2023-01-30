import java.util.*;
import java.io.*;
public class Run
	{
		static public ArrayList <Board> monoply = new ArrayList <Board>();
		static public ArrayList <Player> players = new ArrayList <Player>();
		static public ArrayList <Board> humanOwn = new ArrayList <Board>();
		static public ArrayList <Board> aiOwn = new ArrayList <Board>();
		static int [ ] myBoard;
		static int position;
		static Scanner userStringInput = new Scanner(System.in);
	    static Scanner userIntInput=new Scanner(System.in);
		public static void main(String[] args) throws IOException
			{
				fillPropeties();
				greetUser();
				showProperties();

			}
		private static void fillPropeties() throws IOException
			{
				Scanner file = new Scanner(new File( "Classic.txt" ));    
				for(int i = 0; i< 40; i++)
					{
						String idenifyingBoard = file.next();
						if(idenifyingBoard.equals("properties"))
							{
								
							}
					}
				players.add(new Human("Fred",1500));
				players.add(new AI("Fred",1500));
				for(int i = 0; i< 40; i++)
					{
						i = myBoard[i];
					}
			}
		public static void greetUser()
		    {
		    System.out.println("What is your name?");
		    String name = userStringInput.nextLine();
		    players.get(0).setName(name);
		    System.out.println("hello "+ name);
		    System.out.println();
		    
		    }
		public static void showProperties()
		{
			for(int i = 0; i< i; i++)
				{
					monoply.get(i);
				}
		}

	}
