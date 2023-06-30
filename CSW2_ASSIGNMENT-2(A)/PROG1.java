import java.util.ArrayList;
import java.util.*;

public class PROG1 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		System.out.println("The array list is "+al);
		System.out.println();
		
		System.out.println("Enter the number you want to search");
		int num=sc.nextInt();
//		if(num==1||num==2||num==3)
//			System.out.println("The number is present in the list");
//		else
//			System.out.println("The number is not present in the list");
		System.out.println("The number is present in the list: " +al.contains(num));
		System.out.println();
		
		System.out.println("Which position you want to remove");
		int revNum=sc.nextInt();
		al.remove(revNum);
		System.out.println("The updated array list is "+al);
		System.out.println();
		
		if(al.isEmpty())
			System.out.println("ArrayList is empty");
		else
			System.out.println("ArrayList is not empty");
		

	}

}
