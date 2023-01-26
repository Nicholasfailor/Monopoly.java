
public  abstract class Cards extends Board
	{


	protected String typeOfCard;
	protected Cards(String tOC)
	{
		typeOfCard=tOC;
	}
	protected String getTypeOfCard()
		{
			return typeOfCard;
		}
	protected void setTypeOfCard(String typeOfCard)
		{
			this.typeOfCard = typeOfCard;
		}
	protected abstract void changeLocation();

	}
