import java.util.*;

public class PROG2 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		LinkedList<String> student=new LinkedList<String>();
		student.add("Ralasi");
		student.add("20");
		student.add("90");
		System.out.println("Student data list "+student);
		
		System.out.println("Enter the element you want to search");
		String se=sc.nextLine();		
		System.out.println("Presnt: "+student.contains(se));
		System.out.println();
		
		System.out.println("Enter which you want to remove");
		
		String removeElement = sc.nextLine();
		student.remove(removeElement);
		System.out.println("The updated list is "+student);
		System.out.println("The remove element is "+removeElement);
		System.out.println("The number of element present in the list is "+student.size());
		
		

	}

}
