import java.util.Arrays;

public class PROG10_BETTER 
{
	public static int getMin(int arr[],int size)
	{
		int min=Integer.MAX_VALUE;
		for(int i=0;i<size;i++)
		{
			if(arr[i]<min)
				min=arr[i];
		}
		return min;
	}
	
	public static int getMax(int arr[],int size)
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i<size;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		return max;
	}
	
	public static int getMedian(int arr[],int size)
	{
		Arrays.sort(arr);
		return arr[size/2];
	}

	public static void main(String[] args) 
	{
		int arr[]= {3,-6,8,10,3,3};
		System.out.println("Max is: "+getMax(arr,arr.length));
		System.out.println("Min is: "+getMin(arr,arr.length));
		System.out.println("Median is: "+getMedian(arr,arr.length));

	}

}
