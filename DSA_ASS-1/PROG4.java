import java.util.*;

public class PROG4 
{

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter value of sentences");
	    int n =sc.nextInt();
		String str[] =new String[n];
		System.out.println("Enter "+n+" sentences");
		sc.nextLine();
		for(int i=0;i<n;i++)
		{
		  str[i] =sc.nextLine();
		}
		System.out.println("Display the sentences in reverse order");
		for(int i=n-1;i>=0;i--)
		{
		  System.out.println(str[i]);
		}
		
		sc.close();
	}

}
