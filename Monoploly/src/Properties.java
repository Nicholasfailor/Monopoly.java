
public class Properties extends Board
	{
		protected String type;
		protected String name;
		protected int cost;
		protected int initalRent;
		protected String colorOfGroup;
		protected int costOfHouse;
		protected int numberOfHouse;
		protected int rentPerHouse;
		protected boolean hotel;
		protected int costOfHotel;
		protected int rentPerHotel;
		protected Properties(String t, String n, int c, int iR, String cOG, int cOHu, int nOHu, int rPHu, boolean ho, int cOHo, int rPHo)
		{
			type=t;
			name=n;
			cost=c;
			initalRent=iR;
			colorOfGroup=cOG;
			costOfHouse=cOHu;
			numberOfHouse=nOHu;
			rentPerHouse=rPHu;
			hotel=ho;
			costOfHotel=cOHo;
			rentPerHotel=rPHo;
		}
		protected String getType()
			{
				return type;
			}
		protected void setType(String type)
			{
				this.type = type;
			}
		protected int getInitalRent()
			{
				return initalRent;
			}
		protected void setInitalRent(int initalRent)
			{
				this.initalRent = initalRent;
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
		protected String getColorOfGroup()
			{
				return colorOfGroup;
			}
		protected void setColorOfGroup(String colorOfGroup)
			{
				this.colorOfGroup = colorOfGroup;
			}
		protected int getCostOfHouse()
			{
				return costOfHouse;
			}
		protected void setCostOfHouse(int costOfHouse)
			{
				this.costOfHouse = costOfHouse;
			}
		protected int getNumberOfHouse()
			{
				return numberOfHouse;
			}
		protected void setNumberOfHouse(int numberOfHouse)
			{
				this.numberOfHouse = numberOfHouse;
			}
		protected int getRentPerHouse()
			{
				return rentPerHouse;
			}
		protected void setRentPerHouse(int rentPerHouse)
			{
				this.rentPerHouse = rentPerHouse;
			}
		protected boolean isHotel()
			{
				return hotel;
			}
		protected void setHotel(boolean hotel)
			{
				this.hotel = hotel;
			}
		protected int getCostOfHotel()
			{
				return costOfHotel;
			}
		protected void setCostOfHotel(int costOfHotel)
			{
				this.costOfHotel = costOfHotel;
			}
		protected int getRentPerHotel()
			{
				return rentPerHotel;
			}
		protected void setRentPerHotel(int rentPerHotel)
			{
				this.rentPerHotel = rentPerHotel;
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
