/*Write a Java method, isOdd, that takes an int i and returns true if and only if i is odd. Your 
method can't use the multiplication, modulus, or division operators, however.*/

import java.util.*;

public class PROG5
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		boolean result=isOdd(n);
		System.out.println("Result= "+result);
	}	
		public static boolean isOdd(int i)
		{
		  while(i!=0&&i>0)
		  {
			  i=i-2;
		  }
		  if(i==0)
		  {
			  return false;
		  }
		  else
		  {
			  return true;
		  }

	}

}
