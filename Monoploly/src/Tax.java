
public class Tax
	{
		protected String name;
		protected int tax;
		protected Tax(String n, int t)
		{
			
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