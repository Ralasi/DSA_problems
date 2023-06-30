import java.util.*;

public class PROG1 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers a,b and c");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a+b==c)
			System.out.println("The 1st condition is correct");
		else if(b-c==a)
			System.out.println("The 2nd condition is correct");
		else if(a*b==c)
			System.out.println("The 3rd condition is correct");
		else if(a+b==c&&b-c==a&&a*b==c)
			System.out.println("All are correct");
		else
			System.out.println("Nothing is correct");
		
	}
	

}
