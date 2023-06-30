import java.util.*;
public class PROG1
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your lucky number");
		int n=sc.nextInt();
		try
		{
			if(n<0)
				throw new ArithmeticException("Negative input");
		}
		catch(Exception e)
		{
			System.out.println("Exception "+e);
		}

	}

}
