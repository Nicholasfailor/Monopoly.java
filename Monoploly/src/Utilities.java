
public class Utilities extends Board
	{
		protected void setType(String type)
		{
			this.type = type;
		}


		protected String type;
		protected String name;
		protected int cost;
		protected Utilities(String t, String n, int c)
		{
			type=t;
			name=n;
			cost=c;
		}


	protected String getName()
			{
				return name;
			}


		protected void setName(String name)
			{
				this.name = name;
			}


		protected int getCost()
			{
				return cost;
			}


		protected void setCost(int cost)
			{
				this.cost = cost;
			}


	protected void rollNumberOfDice()
		{
			
		}


	protected String getType()
		{
			return type;
		}


	@Override
	protected int getTax()
		{
			// TODO Auto-generated method stub
			return 0;
		}


	@Override
	protected void setJailTime(boolean b)
		{
			// TODO Auto-generated method stub
			
		}








	}
