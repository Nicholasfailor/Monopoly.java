
public class Jail extends Board
	{
	protected String type;
	protected String name;
	protected boolean jailTime;
	protected Jail(String t, String n, boolean jT)
	{
		type=t;
		name=n;
		jailTime=jT;
	}
	protected String getType()
		{
			return type;
		}
	protected void setType(String type)
		{
			this.type = type;
		}
	protected void setName(String name)
		{
			this.name = name;
		}
	protected boolean isJailTime()
		{
			return jailTime;
		}
	protected void setJailTime(boolean jailTime)
		{
			this.jailTime = jailTime;
		}
	protected String getName()
		{
			return name;
		}

	@Override
	protected int getTax()
		{
			// TODO Auto-generated method stub
			return 0;
		}

	protected int getCost()
		{
			// TODO Auto-generated method stub
			return 0;
		}

	

	}
