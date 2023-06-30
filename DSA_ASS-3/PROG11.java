import java.util.*;

class GCD
{
	int gcd(int m,int n)
	{
		if(n==0)
			return m;
		else if(n>m)
			return gcd(n,m);
		else
			return gcd(n,m%n);
	}
}
public class PROG11 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		GCD obj=new GCD();
		System.out.println("Enter the 2 value to find GCD");
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("GCD of "+x+" and "+y+" is "+ obj.gcd(x, y));

	}

}
