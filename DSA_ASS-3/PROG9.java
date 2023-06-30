import java.util.*;
//WRONG PROGRAM
class REVERSE
{
	void rev(int n)
	{
		if(n<10)
			System.out.print(n);
		else
		{
			System.out.print(n%10);
			rev(n%10);
		}
	}
}
public class PROG9
{
	

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		REVERSE obj=new REVERSE();
		System.out.println("Enter the number");
		int n=sc.nextInt();
		obj.rev(n);

	}

}
