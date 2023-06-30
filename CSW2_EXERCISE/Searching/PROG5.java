package Searching;

public class PROG5
{
	public static void swap(int arr[],int x,int y)
	{
		int t=arr[x];
		arr[x]=arr[y];
		arr[y]=t;
	}
	
	public static void partation012(int arr[],int size)
	{
		int left=0;
		int right=size-1;
		int i=0;
		while(i<=right)
		{
			if(arr[i]==0)
			{
				swap(arr,i,left);
				i++;
				left++;
			}
			else if(arr[i]==2)
			{
				swap(arr,i,right);
				right--;
			}
			else
			{
				i++;
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
		int arr[]= {2,1,0,0,1,1,2,2,1,2,0,2,1};
		partation012(arr,arr.length);
		printArray(arr);

	}

}
