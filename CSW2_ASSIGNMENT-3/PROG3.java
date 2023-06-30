
public class PROG3 
{
	public static int minSwaps(int arr[],int size,int value)
	{
		int left=0;
		int right=size-1;
		int swaps=0;
		while(left<right)
		{
			if(arr[left]<=value)
				left++;
			else if(arr[right]>value)
				right--;
			else	
			{
				swap(arr,left,right);
				swaps++;
			}
		}
		System.out.println("Min number of swaps is: "+swaps);
		return swaps;
	}
	
	
	public static void swap(int arr[],int x,int y)
	{
		int temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}
	
	public static void main(String[] args) 
	{
		int arr[]= {3,5,8,1,6};
		minSwaps(arr,arr.length, 5);
	}

}
