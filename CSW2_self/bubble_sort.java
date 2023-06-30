import java.util.Arrays;
import java.util.*;

public class bubble_sort 
{
	public static void minDiffPair(int arr1[],int n1,int arr2[],int n2)
	{
		int out1=0,out2=0;
		int minDiff=Integer.MAX_VALUE;
		int i=0;
		int j=0;
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		while(i<n1 && j<n2)
		{
			int diff=Math.abs(arr1[i]-arr2[j]);
			if(minDiff>diff)
			{
				minDiff=diff;
				out1=arr1[i];
				out2=arr2[j];
			}
			else if(arr1[i]<arr2[j])
				i++;
			else
				j--;
		}
		System.out.println("Min diff is: "+minDiff);
		System.out.println("Pair is :"+arr1[i]+","+arr2[j]);
		
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
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) 
	{
		int arr[]= {4,7,2,5,1};
		findPair(arr,arr.length,6);

	}

}
