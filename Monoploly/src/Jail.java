
public class Jail extends Board
	{
	protected String name;
	protected boolean jailTime;
	protected Jail(String n, boolean jT)
	{
		name=n;
		jailTime=jT;
	}
	protected String getName()
		{
			return name;
		}
	protected boolean isJailTime()
		{
			return jailTime;
		}
	

	}
