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
				//System.out.println(monoply.size());
				greetUser();
				System.out.println("You are at "+monoply.get(0).getName());
				runBoard();
				

			}
		private static void runBoard()
			{
				int mon =players.get(0).getMoney();
				System.out.println(players.get(0).getName()+" gets $"+mon);
				int choice=0;
				System.out.println("What do you want to choose");
				System.out.println("(1) Roll Dice");
				System.out.println("(2) Show Properties");
				choice =userIntInput.nextInt();
				if(choice==1)
					{
						System.out.println("CardPlaceholder");
						rollDice();
						displaySpot();
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
						runBoard();
					}
				
			}
		private static void rollDice()
			{

				 rollDice =(int) (Math.random()*6)+1;
				 int rollDice2 =(int) (Math.random()*6)+1;
				 players.get(0).setLocation(players.get(0).getLocation()+rollDice+rollDice2);
				 System.out.println("CardPlaceholder");
			}
		private static void displaySpot()
			{
				System.out.println("CardPlaceholder");
				System.out.println(players.get(0).getLocation());
			String t = monoply.get(players.get(0).getLocation()).getType();
			System.out.println(t);
				if(t.equals("Go"))
					{
						System.out.println("CardPlaceholder");
						goOrFree();
					}
				else if(t.equals("CardPlaceholder"))
					{
						System.out.println("Sorry we haven't implemented it yet.");
						System.out.println("CardPlaceholder");
					}
				else if(t.equals("Tax"))
					{
						System.out.println("CardPlaceholder");
						taxes();
					}
				else if(t.equals("RailRoads"))
					{
						System.out.println("CardPlaceholder");
						prop();
					}
				else if(t.equals("Jail"))
					{
						System.out.println("CardPlaceholder");
						areYouInJail();
					}
				else if(t.equals("Utilities"))
					{
						System.out.println("CardPlaceholder");
						prop();
					}
				else if(t.equals("Properties"))
					{
						System.out.println("CardPlaceholder");
						prop();
					}
				aiRoll();
				runBoard();
			}
		
		private static void prop()
			{
				System.out.println("CardPlaceholder5");
				String n = monoply.get(players.get(0).getLocation()).getName();
				System.out.println(players.get(0).getName()+" landed on "+n);
				System.out.println("Do you want to buy "+n);
				int choiceProp=0;
				System.out.println("What do you want to buy?");
				System.out.println("(1) yes");
				System.out.println("(2) no");
				choiceProp =userIntInput.nextInt();
				if(choiceProp==1)
					{
						humanOwn.add(monoply.get(players.get(0).getLocation()));
						int c = monoply.get(players.get(0).getLocation()).getCost();
						int mon =players.get(0).getMoney()-c;
						players.get(0).setMoney(mon);
						System.out.println("you have $"+mon);
						showProperties();
					}
				else if(choiceProp==2)
					{
						System.out.println(players.get(0).getName()+" did not buy "+ n);
					}
				
				
			}
		
		private static void areYouInJail()
			{
				System.out.println("CardPlaceholder");
				String n = monoply.get(players.get(0).getLocation()).getName();
				if(n.equals("Go_To_Jail"))
					{
						System.out.println(players.get(0).getName()+" landed on "+n);
						monoply.get(players.get(0).getLocation()).setJailTime(true);
						System.out.println(players.get(0).getName()+" is now in jail");
						players.get(0).setLocation(10);
					}
				else
					{
						System.out.println(players.get(0).getName()+" landed on "+n);
					}
			}

		private static void taxes()
			{
				System.out.println("CardPlaceholder");
				String n = monoply.get(players.get(0).getLocation()).getName();
				System.out.println(players.get(0).getName()+" landed on "+n);
				int t = monoply.get(players.get(0).getLocation()).getTax();
				int mon =players.get(0).getMoney()-t;
				players.get(0).setMoney(mon);
				System.out.println(players.get(0).getName()+" loses $"+t);
			}
		private static void goOrFree()
			{
				System.out.println("CardPlaceholder");
				String n = monoply.get(players.get(0).getLocation()).getName();
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
		
		private static void fillPropeties() throws IOException
			{
				int choiceGame=0;
				System.out.println("What game do you want to play?");
				System.out.println("(1) Original");
				System.out.println("(2) Around the World");
				choiceGame =userIntInput.nextInt();
				Scanner file = null;
				if(choiceGame==1)
					{
						 file = new Scanner(new File( "Classic.txt" ));
					}
				else if(choiceGame==2)
					{
						 file = new Scanner(new File( "AroundTheWorld.txt" ));
					}
				else
					{
						System.out.println("You must choose a game!");
						fillPropeties();
					}
				for(int i = 0; i< 40; i++)
					{
						String idenifyingBoard = file.next();
						if(idenifyingBoard.equals("Properties"))
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
								monoply.add(new Properties ("Properties",n, c ,iR, cOG, cOHu, nOHu, rPHu, ho, cOHo, rPHo));
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
		public static void aiRoll()
		{
			rollDice =(int) (Math.random()*6)+1;
			rollDice =(int) (Math.random()*6)+1;
			 players.get(1).setLocation(players.get(1).getLocation());
			 String t = monoply.get(players.get(1).getLocation()).getType();
				if(t.equals("Go"))
					{
						String n = monoply.get(players.get(1).getLocation()).getName();
						if(n.equals("Go"))
							{
								System.out.println(players.get(1).getName()+" landed on "+n);
								System.out.println(players.get(1).getName()+" gets $200");
								int mon =players.get(1).getMoney()+200;
								players.get(1).setMoney(mon);
							}
						else
							{
								System.out.println(players.get(1).getName()+" landed on "+n);
							}
					}
				else if(t.equals("CardPlaceholder"))
					{
						System.out.println("Sorry we haven't implemented it yet.");
					}
				else if(t.equals("Tax"))
					{
						String n = monoply.get(players.get(1).getLocation()).getName();
						System.out.println(players.get(1).getName()+" landed on "+n);
						int ta = monoply.get(players.get(1).getLocation()).getTax();
						int mon =players.get(1).getMoney()-ta;
						players.get(1).setMoney(mon);
						System.out.println(players.get(1).getName()+" loses $"+ta);
					}
				else if(t.equals("RailRoads"))
					{
						String n = monoply.get(players.get(1).getLocation()).getName();
						System.out.println(players.get(1).getName()+" landed on "+n);
						System.out.println("Do you want to buy "+n);
						
						int c = monoply.get(rollDice).getCost();
						
						if(players.get(1).getMoney()>c)
							{
								aiOwn.add(monoply.get(players.get(1).getLocation()));
								int mon =players.get(1).getMoney()-c;
								System.out.println(players.get(1).getName()+" have $"+mon);
								players.get(1).setMoney(mon);
							}
						else 
							{
								System.out.println(players.get(1).getName()+" did not buy "+ n);
							}
					}
				else if(t.equals("Jail"))
					{
						String n = monoply.get(players.get(1).getLocation()).getName();
						if(n.equals("Go_To_Jail"))
							{
								System.out.println(players.get(1).getName()+" landed on "+n);
								monoply.get(players.get(1).getLocation()).setJailTime(true);
								System.out.println(players.get(1).getName()+" is now in jail");
								players.get(1).setLocation(10);
							}
						else
							{
								System.out.println(players.get(1).getName()+" landed on "+n);
							}
					}
				else if(t.equals("Utilities"))
					{
						String n = monoply.get(rollDice).getName();
						System.out.println(players.get(1).getName()+" landed on "+n);
						System.out.println("Do you want to buy "+n);
						
						int c = monoply.get(rollDice).getCost();
						
						if(players.get(1).getMoney()>c)
							{
								aiOwn.add(monoply.get(players.get(1).getLocation()));
								int mon =players.get(1).getMoney()-c;
								System.out.println(players.get(1).getName()+" have $"+mon);
								players.get(1).setMoney(mon);
							}
						else 
							{
								System.out.println(players.get(1).getName()+" did not buy "+ n);
							}
					}
				else if(t.equals("Properties"))
					{
						String n = monoply.get(players.get(1).getLocation()).getName();
						System.out.println(players.get(1).getName()+" landed on "+n);
						System.out.println("Do you want to buy "+n);
						
						int c = monoply.get(rollDice).getCost();
						
						if(players.get(1).getMoney()>c)
							{
								aiOwn.add(monoply.get(players.get(1).getLocation()));
								int mon =players.get(1).getMoney()-c;
								System.out.println(players.get(1).getName()+" have $"+mon);
								players.get(1).setMoney(mon);
							}
						else 
							{
								System.out.println(players.get(1).getName()+" did not buy "+ n);
							}
					}
				for(int i = 0; i< i; i++)
					{
						aiOwn.get(i);
					}
		}

	}
