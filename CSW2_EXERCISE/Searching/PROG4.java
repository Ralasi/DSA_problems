package Searching;

public class PROG4 
{
	public static void swap(int arr[],int x,int y)
	{
		int temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}
	
	public static void partation01(int arr[],int size)
	{
		int left=0;
		int right=size-1;
		while(left<right)
		{
			while(arr[left]==0)
				left++;
			while(arr[right]==1)
				right--;
			if(left<right)
			{
				swap(arr,left,right);
			}
		}
	}
	
	 static void printArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) 
	{
		int arr[]= { 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1 };
		System.out.println("After sorting");
		partation01(arr,arr.length);
        printArray(arr);
	}

}
