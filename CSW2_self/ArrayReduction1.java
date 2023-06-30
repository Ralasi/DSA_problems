
public class ArrayReduction1 
{
	public static int union(int arr1[],int arr2[],int m,int n)
	{
		int i=0,j=0;
		while(i<m&&j<n)
		{
			if(arr1[i]<arr2[j])
			{
				System.out.println(arr1[i++]+" ");
			}
			else if(arr1[i]>arr2[j])
			{
				System.out.println(arr2[j++]+" ");
			}
			else
			{
				System.out.println(arr2[j++]+" ");
				i++;
			}
		}
			while(i<m)
			{
				System.out.println(arr1[i++]+" ");
			}
			while(j<n)
			{
				System.out.println(arr2[j++]+" ");
			}
		
		return 0;
	}
	
	public static void Intersection(int arr1[],int arr2[],int m,int n)
	{
		int i=0,j=0;
		while(i<m&&j<n)
		{
			if(arr1[i]<arr2[j])
			{
				i++;
			}
			else if(arr1[i]>arr2[j])
			{
				j++;
			}
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
		int arr1[]= {1,3,4,6,2};
		int arr2[]= {3,5};
		union(arr1,arr2,arr1.length,arr2.length);
		Intersection(arr1,arr2,arr1.length,arr2.length);

	}

}
