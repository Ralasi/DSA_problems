import java.util.Arrays;

public class MinMaxMedian 
{
	static class Pair
	{
		int min;
		int max;
	}
	
	static Pair getMinMax(int arr[],int n)
	{
		Pair minmax=new Pair();
		if(n==1)
		{
		   minmax.max=arr[0];
		   minmax.min=arr[0];
		   return minmax;
		}
		if(arr[0]>arr[1]) 
		{
			minmax.max=arr[0];
			minmax.min=arr[1];
		}
		else
		{
			minmax.max=arr[1];
			minmax.min=arr[0];
		}
		for(int i=2;i<n;i++)
		{
			if(arr[i]>minmax.max)
			{
				minmax.max=arr[i];
			}
			else if(arr[i]<minmax.min)
			{
				minmax.min=arr[i];
			}
		}
		return minmax;
	}
	
	public static double findMedian(int arr[],int n)
	{
		Arrays.sort(arr);
		if(n%2!=0)
			return (double)arr[n/2];
		
		return (double)(arr[(n-1)/2]+arr[n/2])/2;
	}
	
	public static void main(String[] args) 
	{
		int arr[]= {3,2,7,9,1,6,-2};
		Pair minmax=getMinMax(arr,arr.length);
		System.out.println("\nThe min value is "+minmax.min);
		System.out.println("\nThe max value is "+minmax.max);
		System.out.println("The median is "+findMedian(arr,arr.length));

	}

}
