import java.time.ZoneId;

class ZoneId1
{	
	public static void main(String[] args)
	{
		ZoneId zId = ZoneId.systemDefault();
		System.out.println(zId);
	}
}