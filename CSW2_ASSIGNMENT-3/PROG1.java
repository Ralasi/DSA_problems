
public class PROG1 
{
	
	public static int Partation01(int arr[],int size)
	{
		int countSwaps=0;
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
				countSwaps++;
			}
		}
		System.out.println("Minimum no. of swaps is:  "+countSwaps);
		return countSwaps;	
	}
	
	
	public static void swap(int arr[],int x,int y)
	{
		int temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}
	
	public static void printArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println();
	}


	public static void main(String[] args) 
	{
		PROG1 q1=new PROG1();
		int arr[]= {0,1,1,0,1,1,0};
		Partation01(arr,arr.length);
		printArray(arr);
		

	}

}
