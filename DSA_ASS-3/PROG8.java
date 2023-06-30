import java.util.*;

public class PROG8 
{
	static int pow(int x,int n)
	{
		if(n==0)
			return 1;
		if(n==1)
			return x;
		else
			return x*pow(x,n-1);
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number x and power n value");
		int x=sc.nextInt();
		int n=sc.nextInt();
		int k=pow(x,n);
		System.out.println("The value of x^n is ="+k);

	}

}
