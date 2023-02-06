
public class RailRoads extends Board
	{
		protected String type;
		protected String name;
		protected int cost;
		protected RailRoads(String t, String n, int c)
		{
			type=t;
			name=n;
			cost=c;
		}
		
	protected String getType()
			{
				return type;
			}

		protected void setType(String type)
			{
				this.type = type;
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

	protected  void countRailRoads()
	{
		
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
