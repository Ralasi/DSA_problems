import java.util.*;
//DOUGHT
class ReverseX
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
public class PROG15 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String n=sc.next();
		ReverseX obj=new ReverseX();
		String s=obj.Revs(n,n.length()-1," ");
		System.out.println();

	}

}
