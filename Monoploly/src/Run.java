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
				int mon =players.get(0).getMoney();
				System.out.println(players.get(0).getName()+" gets "+mon);
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
			String t = monoply.get(rollDice).getType();
				if(t.equals("Go"))
					{
						goOrFree();
					}
				else if(t.equals("CardPlaceholder"))
					{
						System.out.println("Sorry we haven't implemented it yet.");
					}
				else if(t.equals("Tax"))
					{
						taxes();
					}
				else if(t.equals("RailRoads"))
					{
						rails();
					}
				else if(t.equals("Jail"))
					{
						areYouInJail();
					}
				else if(t.equals("Utilities"))
					{
						util();
					}
				else if(t.equals("Properties"))
					{
						prop();
					}
			}
		
		private static void prop()
			{
				// TODO Auto-generated method stub
				
			}
		private static void util()
			{
				
				
			}
		private static void areYouInJail()
			{
				
				
			}
		private static void rails()
			{
				
				
			}
		private static void taxes()
			{
				String n = monoply.get(rollDice).getName();
				System.out.println(players.get(0).getName()+" landed on "+n);
				int t = monoply.get(rollDice).getTax();
				int mon =players.get(0).getMoney()-t;
				players.get(0).setMoney(mon);
				System.out.println(players.get(0).getName()+" loses $"+t);
			}
		private static void goOrFree()
			{
				String n = monoply.get(rollDice).getName();
				if(n.equals("Go"))
					{
						System.out.println(players.get(0).getName()+" landed on "+n);
						System.out.println(players.get(0).getName()+" gets $200");
						int mon =players.get(0).getMoney()+200;
						players.get(0).setMoney(mon);
					}
				else
					{
						System.out.println(players.get(0).getName()+" landed on "+n);
					}
				
			}
		private static void rollDice()
		{

			 rollDice =(int) (Math.random()*6)+1;
			 players.get(0).setLocation(rollDice);
		}
		private static void fillPropeties() throws IOException
			{
				Scanner file = new Scanner(new File( "Classic.txt" ));    
				for(int i = 0; i< 40; i++)
					{
						String idenifyingBoard = file.next();
						if(idenifyingBoard.equals("properties"))
							{
								String n = file.next();
								int c = file.nextInt();;
								int iR = file.nextInt();
								String cOG = file.next();
								int cOHu = file.nextInt();
								int nOHu=file.nextInt();;
								int rPHu =file.nextInt();
								boolean ho=file.nextBoolean();;
								int cOHo=file.nextInt();;
								int rPHo = file.nextInt();
								monoply.add(new Properties ("properties",n, c ,iR, cOG, cOHu, nOHu, rPHu, ho, cOHo, rPHo));
							}
						else if(idenifyingBoard.equals("Go"))
							{
								String n = file.next();
								monoply.add(new Go ("Go",n));
							}
						else if(idenifyingBoard.equals("CardPlaceholder"))
							{
								String n = file.next();
								monoply.add(new CardPlaceholder ("CardPlaceHolder",n));
							}
						else if(idenifyingBoard.equals("Tax"))
							{
								String n = file.next();
								int t= file.nextInt();
								monoply.add(new Tax ("Tax",n,t));
							}
						else if(idenifyingBoard.equals("RailRoads"))
							{
								String n = file.next();
								int c= file.nextInt();
								monoply.add(new RailRoads ("RailRoads",n,c));
							}
						else if(idenifyingBoard.equals("Jail"))
							{
								String n = file.next();
								boolean jT= file.nextBoolean();
								monoply.add(new Jail ("Jail",n,jT));
							}
						else if(idenifyingBoard.equals("Utilities"))
							{
								String n = file.next();
								int c= file.nextInt();
								monoply.add(new Utilities ("Utilities",n,c));
							}
					}
				players.add(new Human("Fred",1500,null,0));
				players.add(new AI("Fred",1500,null,0));

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
