
public abstract class Board
	{
		protected String type;
		protected String name;
		protected int location;
		protected String owner;
		public  void transferMoney()
		{
			
		}
		protected abstract String getType();
		protected abstract String getName();
		protected abstract int getTax();
		protected abstract int getCost();
		protected abstract void setJailTime(boolean b);
		

	}
