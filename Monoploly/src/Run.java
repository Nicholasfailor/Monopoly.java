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
	    static int rollDice;
		public static void main(String[] args) throws IOException
			{
				fillPropeties();
				greetUser();
				System.out.println("You are at Go");
				runBoard();
				

			}
		private static void runBoard()
			{
				int choice=0;
				System.out.println("What do you want to choose");
				System.out.println("(1) Roll Dice");
				System.out.println("(2) Show Properties");
				choice =userIntInput.nextInt();
				if(choice==1)
					{
						rollDice();
					}
				else if(choice==2)
					{
						if(humanOwn.size()<=0)
							{
								System.out.println("You do not own any properties");
							}
						else
							{
								showProperties();
							}
					}
				showProperty();
			}
		private static void showProperty()
			{
				
				
			}
		private static void rollDice()
		{
			 rollDice =(int) (Math.random()*6)+1;
		}
		private static void fillPropeties() throws IOException
			{
				Scanner file = new Scanner(new File( "Classic.txt" ));    
				for(int i = 0; i< 40; i++)
					{
						String idenifyingBoard = file.next();
						if(idenifyingBoard.equals("properties"))
							{
								String n = file.nextLine();
								int c = file.nextInt();;
								int iR = file.nextInt();
								String cOG = file.nextLine();
								int cOHu = file.nextInt();
								int nOHu=file.nextInt();;
								int rPHu =file.nextInt();
								boolean ho=file.nextBoolean();;
								int cOHo=file.nextInt();;
								int rPHo = file.nextInt();
								monoply.add(new Properties (n, c ,iR, cOG, cOHu, nOHu, rPHu, ho, cOHo, rPHo));
							}
						else if(idenifyingBoard.equals("Go"))
							{
								String n = file.nextLine();
								monoply.add(new Go (n));
							}
						else if(idenifyingBoard.equals("CardPlaceholder"))
							{
								String n = file.nextLine();
								monoply.add(new CardPlaceholder (n));
							}
						else if(idenifyingBoard.equals("Tax"))
							{
								String n = file.nextLine();
								int t= file.nextInt();
								monoply.add(new Tax (n,t));
							}
						else if(idenifyingBoard.equals("RailRoads"))
							{
								String n = file.nextLine();
								int c= file.nextInt();
								monoply.add(new RailRoads (n,c));
							}
						else if(idenifyingBoard.equals("Jail"))
							{
								String n = file.nextLine();
								boolean jT= file.nextBoolean();
								monoply.add(new Jail (n,jT));
							}
						else if(idenifyingBoard.equals("Utilities"))
							{
								String n = file.nextLine();
								int c= file.nextInt();
								monoply.add(new Utilities (n,c));
							}
					}
				players.add(new Human("Fred",1500,null,0));
				players.add(new AI("Fred",1500,null,0));
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
					humanOwn.get(i);
				}
		}

	}
