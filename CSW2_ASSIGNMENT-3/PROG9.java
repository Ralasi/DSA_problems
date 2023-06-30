import java.util.Arrays;

public class PROG9 
{
	public static int union(int arr1[],int arr2[],int m,int n)
	{
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int i=0,j=0;
		while(i<m&&j<n)
		{
			if(arr1[i]<arr2[j])
				System.out.print(arr1[i++]+" ");
			else if(arr1[i]>arr2[j])
				System.out.print(arr2[j++]+" ");
			else
			{
				System.out.print(arr2[j++]+" ");
				i++;
			}
		}
		while(i<m)
		{
			System.out.print(arr1[i++]+" ");
		}
		while(j<n)
		{
			System.out.print(arr2[j++]+" ");
		}
	  return 0;
	}
	
	public static void Intersection(int arr1[],int arr2[],int m,int n)
	{
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int i=0,j=0;
		while(i<m&&j<n)
		{
			if(arr1[i]<arr2[j])
				i++;
			else if(arr1[i]>arr2[j])
				j++;
			else
			{
				System.out.print(arr1[i]+" ");
				i++;
				j++;
			}
		}
	}
	

	public static void main(String[] args) 
	{
		int arr1[]= {4,5,6,1,2};
		int arr2[]= {2,3,5,7};
		System.out.println("Union is:");
		union(arr1,arr2,arr1.length,arr2.length);
		System.out.println("\nIntersection is:");
		Intersection(arr1,arr2,arr1.length,arr2.length);

	}

}
