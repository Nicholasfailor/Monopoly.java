
public class CardPlaceholder extends Board
	{
		protected String type;
		protected String name;
		protected CardPlaceholder(String t, String n)
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

	}
