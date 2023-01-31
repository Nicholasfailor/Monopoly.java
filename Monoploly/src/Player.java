
public abstract class Player 
	{

	protected String name;
	protected int money;
	protected Board inventory;
	protected int location;
	protected Player(String n, int m, Board i, int l)
	{
		name=n;
		money=m;
		inventory=i;
		location=l;
	}
	protected Board getInventory()
		{
			return inventory;
		}
	protected void setInventory(Board inventory)
		{
			this.inventory = inventory;
		}
	protected int getLocation()
		{
			return location;
		}
	protected void setLocation(int location)
		{
			this.location = location;
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
