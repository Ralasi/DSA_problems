import java.util.*;
public class PROG1 
{
//	static boolean isPrime(int n)
//	{
//		if(n<=1)
//			return false;
//		else if(n==2)
//			return true;
//		else if(n%2==0)
//			return false;
//		for(int i=3;i<=Math.sqrt(n);i+=2)
//		{
//			if(n%i==0)
//				return false;
//		}
//		return true;
//	}
//	

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check prime or not");
		int num=sc.nextInt();
		int count=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		if(count==0)
			System.out.println("It is prime");
		else
			System.out.println("It is not prime");

	}

}
