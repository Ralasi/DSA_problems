
public class MinSwaps 
{
	int minSwaps(int arr[],int size,int val)
	{
		int start=0;
		int last=size-1;
		int swapCount=0;
		while(start<last)
		{
			if(arr[start]<=val)
				start+=1;
			else if(arr[last]>val)
				last-=1;
			else
			{
				int temp=arr[start];
				arr[start]=arr[last];
				arr[last]=temp;
				swapCount+=1;
			}
		}
		return swapCount;
	}

	public static void main(String[] args) 
	{
		MinSwaps ms=new MinSwaps();		
		int arr[]= {5,3,6,2,9,4,1,7};	
	    System.out.println(ms.minSwaps(arr,arr.length,3));

	}

}
