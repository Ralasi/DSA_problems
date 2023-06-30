
import java.util.*;

public class PROG3
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	Stack<Integer> stack = new Stack<Integer>();
	
	System.out.println("Enter a decimal number: ");
	int num = sc.nextInt();
	
	while(num>0)
	{
		int r = num%2;
		stack.push(r);
		num/=2;
	}
	
	System.out.print("Binary equivalent: ");
	
	while (!(stack.isEmpty() ))
	{
		
		System.out.print(stack.pop());
	}
}
}
