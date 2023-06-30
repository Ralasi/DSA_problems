package Searching;

public class PROG1 
{
	public static int firstRepeated(int arr[],int size)
	{
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]==arr[j])
				{
					return arr[i];
				}
			}
		}
		return 0;
	}

	public static void main(String[] args)
	{
		int arr[]= {2,4,6,4,9,1};
		System.out.println(firstRepeated(arr,arr.length));

	}

}
