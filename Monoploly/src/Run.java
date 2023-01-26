import java.util.*;
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
		public static void main(String[] args)
			{
				fillPropeties();
				greetUser();
				showProperties();

			}
		private static void fillPropeties()
			{
				monoply.add(new Go("Go"));
				monoply.add(new Properties("Mediterranean Avenue",60,2,"Brown",50,0,15,false,50,250));
				monoply.add(new Properties("Baltic Avenue",60,4,"Brown",50,0,20,false,50,450));
				monoply.add(new RailRoads("Reading RR",200));
				monoply.add(new Properties("Oriental Avenue",100,6,"Light Blue",50,0,30,false,50,550));
				monoply.add(new Properties("Vermont Avenue",100,6,"Light Blue",50,0,30,false,50,550));
				monoply.add(new Properties("Connecticut Avenue",120,8,"Light Blue",50,0,40,false,50,600));
				monoply.add(new Properties("St. Charles Place",140,10,"Pink",50,0,50,false,50,750));
				monoply.add(new Utilities("Electric Company",150));
				monoply.add(new Properties("States Avenue",140,10,"Pink",50,0,50,false,50,750));
				monoply.add(new Properties("Virginia Avenue",160,12,"Pink",50,0,60,false,50,900));
				monoply.add(new RailRoads("Pennsylvania RR",200));
				monoply.add(new Properties("St. James Place",180,14,"Orange",50,0,70,false,50,950));
				monoply.add(new Properties("Tennessee Avenue",180,14,"Orange",50,0,70,false,50,950));
				monoply.add(new Properties("New York Avenue",200,16,"Orange",50,0,80,false,50,1000));
				monoply.add(new Properties("Kentucky Avenue",220,18,"Red",50,0,90,false,50,1050));
				monoply.add(new Properties("Indiana Avenue",220,18,"Red",50,0,90,false,50,1050));
				monoply.add(new Properties("Illinois Avenue",240,20,"Red",50,0,100,false,50,1100));
				monoply.add(new RailRoads("B&O RR",200));
				monoply.add(new Properties("Atlantic Avenue",260,22,"Yellow",50,0,110,false,50,1150));
				monoply.add(new Properties("Ventnor Avenue",260,22,"Yellow",50,0,110,false,50,1150));
				monoply.add(new Utilities("Water Works",150));
				monoply.add(new Properties("Marvin Gardens",280,24,"Yellow",50,0,120,false,50,1200));
				monoply.add(new Properties("Pacific Avenue",300,26,"Green",50,0,130,false,50,1275));
				monoply.add(new Properties("North Carolina Avenue",300,26,"Green",50,0,130,false,50,1275));
				monoply.add(new Properties("Pennsylvania Avenue",320,28,"Green",50,0,150,false,50,1400));
				monoply.add(new RailRoads("Short Line",200));
				monoply.add(new Properties("Park Place",350,35,"Dark Blue",50,0,175,false,50,1500));
				monoply.add(new Properties("Boardwalk",400,50,"Dark Blue",50,0,200,false,50,2000));
				players.add(new Human("Fred",1500));
				players.add(new AI("Fred",1500));
				for(int i = 0; i< 41; i++)
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
			for(int i = 0; i< m; i++)
				{
					monoply.get(i);
				}
		}

	}
