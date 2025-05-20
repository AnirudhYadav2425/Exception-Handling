package Exception_Handling;

import java.util.Scanner;

public class UnderAgeDriver 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Age:");
		int age= sc.nextInt();
		sc.close();
		try 
		{
			Registration.checkEligiblity(age);
		} 
		catch (UnderAgeException e) 
		{
			e.printStackTrace();
		}
		System.out.println("Program Ends !!");
	}
}
