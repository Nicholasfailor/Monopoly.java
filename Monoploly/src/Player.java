
public abstract class Player 
	{

	protected String name;
	protected int money;
	protected Player(String n, int m)
	{
		name=n;
		money=m;
	}
	protected String getName()
		{
			return name;
		}
	protected void setName(String name)
		{
			this.name = name;
		}
	protected int getMoney()
		{
			return money;
		}
	protected void setMoney(int money)
		{
			this.money = money;
		}
	protected abstract void rollDice();


	}
