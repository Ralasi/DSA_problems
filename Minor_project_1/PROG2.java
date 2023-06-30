import java.util.*;
public class PROG2 
{

	public static void main(String[] args) 
	{
		/* Name: Ralasi Rasila Sahoo
		* Section: 2041007
		* Registration no.: 2041019076
		* Program to print all the unique digits present in the number         
	    * and the largest number possible using these unique digits
		*/
		
				Scanner in =new Scanner(System.in);
				System.out.println("Enter a large number:");
				long n= in.nextLong();
				String s = n+"";
				int a=9;
				String s1="";
				StringBuffer s2=new StringBuffer(s);
				
				for(int i =0;i<s.length();i++)
				{
					char c=s.charAt(i);
					for(int j=i+1;j<s.length();j++)
					{
						
						char c1=s.charAt(j);
						if(c==c1&&c1!='*')
							s2.setCharAt(j,'*');
						
					}
				}
				System.out.println("The unique digits are- ");
				
				for(int i= 0;i<s2.length();i++)
				{
					char c=s2.charAt(i);
					if(c!='*')
					{
						System.out.print(c+" ");
					}
				}
				System.out.println();
				
				while(a>=0)
				{
					for(int i=0;i<s.length();i++)
					{
						long n1=n;
						while(n1>0)
						{
							
							if(n1%10==a)
							{
								s1=s1+(n1%10);
								n1=0;
							}
							n1=n1/10;
						}
						i=i+s.length();
					}
					a--;
				}
				n=Long.parseLong(s1);
				System.out.println("The largest number is "+n);
				
				in.close();

	}
	
}
