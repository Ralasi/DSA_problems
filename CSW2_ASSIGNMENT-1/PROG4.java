import java.util.Scanner;
public class PROG4 
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
		PROG4 bs=new PROG4();
		int arr[]= {2,3,4,10,40};
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Enter the number which you want to find");
		int key=sc.nextInt();
		int result=bs.Binary_Search1(arr, key);
		if(result==-1)
			System.out.println("Element is not present");
		else
			System.out.println("Element is present at index "+result);
		
		

	}

}

