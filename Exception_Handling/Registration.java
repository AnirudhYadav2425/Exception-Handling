package Exception_Handling;

public class Registration
{
	public static void checkEligiblity(int age) throws UnderAgeException
	{
		if(age>=18)
		{
			System.out.println("You are eleigible for egistration");
		}
		else
		{
			throw new UnderAgeException("You are UnderAge !!");
		}
	}
	
}