
public  class Cards 
	{


	protected String typeOfCard;
	protected String prompt;
	protected Cards(String tOC,String p)
	{
		typeOfCard=tOC;
		prompt=p;
	}
	protected String getPrompt()
		{
			return prompt;
		}
	protected void setPrompt(String prompt)
		{
			this.prompt = prompt;
		}
	protected String getTypeOfCard()
		{
			return typeOfCard;
		}
	protected void setTypeOfCard(String typeOfCard)
		{
			this.typeOfCard = typeOfCard;
		}
	protected  void changeLocation()
	{
		
	}

	}
