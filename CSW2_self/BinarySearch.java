import java.util.Scanner;
public class BinarySearch 
{  
	int Binary_Search1(int arr[],int key)
	{
		int l=0;
		int r=arr.length-1;
		while(l<=r)
		{
			int m=l+(r-l)/2;
			if(arr[m]==key)
			{
				return m;
			}
			if(arr[m]<key)
			{
				l=m+1;
			}
			else
			{
				r=m-1;
			}
		}
		return -1;
	}
	

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		BinarySearch bs=new BinarySearch();
		int arr[]= {2,3,4,10,40};
		int n=arr.length;
		System.out.println("Enter the number which you want to find");
		int key=sc.nextInt();
		int result=bs.Binary_Search1(arr, key);
		if(result==-1)
			System.out.println("Element is not present");
		else
			System.out.println("Element is present at index "+result);
		
		

	}

}
