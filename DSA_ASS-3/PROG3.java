import java.util.*;
class MarksOutofBoundException extends Exception
{
	MarksOutofBoundException(String str)
	{
		super(str);
	}
}
class StudentE
{
	int mark;
	String name;
	void input() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name and marks of student");
		name=sc.nextLine();
		mark=sc.nextInt();
		try
		{
			if(mark>100)
				throw new MarksOutofBoundException("Not a valid mark");
			else
				System.out.println("Valid mark");
		}
		catch(Exception e)
		{
			System.out.println("Exception "+e);
		}
		
	}
}
public class PROG3 
{

	public static void main(String[] args) 
	{
		StudentE obj=new StudentE();
		obj.input();

	}

}
