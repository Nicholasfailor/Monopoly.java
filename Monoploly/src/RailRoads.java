
public class RailRoads extends Board
	{
		protected String name;
		protected int cost;
		protected RailRoads(String n, int c)
		{
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

	protected  void countRailRoads()
	{
		System.out.println("hello");
	}
	

	}
