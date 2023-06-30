import java.util.*;
//DOUGHT
public class PROG13 
{
	public static double dec2bin(double n)
	{
		if(n<=1)
			return n;
		else
			return dec2bin(n/2)*10+(n%2);
	}

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the decimal number :");
		double n=in.nextDouble();
		double ans=dec2bin(n);
		System.out.println(ans);
	}

	}


