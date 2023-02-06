
public class Go extends Board
	{
		protected String type;
		protected String name;
		protected Go (String t, String n)
		{
			type=t;
			name=n;
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
		@Override
		protected int getTax()
			{
				// TODO Auto-generated method stub
				return 0;
			}
		@Override
		protected int getCost()
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
