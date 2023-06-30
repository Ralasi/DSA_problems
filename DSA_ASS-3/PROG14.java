import java.util.*;

class ReverseS
{
	String Revs(String s,int i,String x)
	{
		if(i<0)
			return x;
		else
		{
			x=x+s.charAt(i);
			return Revs(s,--i,x);
		}
	}
}
//ACTUALLY PROG15
public class PROG14 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String n=sc.next();
		ReverseS obj=new ReverseS();
		String s=obj.Revs(n, n.length()-1, " ");
		System.out.println("The reverse is = "+s);
		
	}

}
