
public class Tax extends Board
	{
		protected String type;
		protected String name;
		protected int tax;
		protected Tax(String ty, String n, int t)
		{
			type=ty;
			name=n;
			tax=t;
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
		protected int getTax()
			{
				return tax;
			}
		protected void setTax(int tax)
			{
				this.tax = tax;
			}
	}
