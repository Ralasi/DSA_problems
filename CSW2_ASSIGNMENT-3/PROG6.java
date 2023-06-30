
public class PROG6
{
	public static void seperateEvenOdd(int arr[],int size)
	{
		int left=0;
		int right=size-1;
		while(left<right)
		{
			if(arr[left]%2==0)
				left++;
			else if(arr[right]%2==1)
				right--;
			else
			{
				swap(arr,left,right);
				left++;
				right--;
			}
		}
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
		int arr[]= {2,1,5,6,7,9,8,0};
		seperateEvenOdd(arr,arr.length);
		printArray(arr);

	}

}
