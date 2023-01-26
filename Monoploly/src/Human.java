
public class Human extends Player
	{

	protected Human(String n, int m)
		{
			super(n, m);
			// TODO Auto-generated constructor stub
		}
	static int rollDice;
	public void rollDice()
	{
		int rollDice =(int) (Math.random()*6)+1;
	}

	}
