import java.util.*;

public class PROG7 
{
	static int fact(int n)
	{
		if(n==0)
			return 1;
		else
			return n*fact(n-1);
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value to find factorial");
		int n=sc.nextInt();
		int k=fact(n);
		System.out.println("The factorial of number is=" +k);

	}

}
