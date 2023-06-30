import java.util.*;
public class LinearSearch
{
	public static int linear_Search(int arr[],int x)
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==x)
				return i;
		}
		return -1;
	}
	
	void printArray(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		LinearSearch ls=new LinearSearch();
		int arr[]={ 2, 3, 4, 10, 40,6,7 };
		ls.printArray(arr);
		System.out.println("Enter the element to find index");
		int x=sc.nextInt();
		int result=linear_Search(arr,x);
		if(result==-1)
			System.out.println("Element is not present in the arrray");
		else
			System.out.println("Element is present at index "+result);

	}

}
