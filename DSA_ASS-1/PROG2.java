import java.util.*;

public class PROG2
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		
		int count=0;
		while(n>=2)
		{
			n=n/2;
			count++;
		}
		System.out.println("The number of times is "+count);
		sc.close();
	}

}
