package Searching;

public class PROG2 
{
	static boolean find3Numbers(int arr[],int size,int sum)
	{
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				for(int k=j+1;k<size;k++)
				{
					if(arr[i]+arr[j]+arr[k]==sum)
					{
					   System.out.print("Triplet is "+arr[i]+" "+arr[j]+" "+arr[k]);
					   return true;
					}
					
				}
			}
		}
		return false;
	}

	public static void main(String[] args) 
	{
		int arr[]= {2,4,6,8,1,3};
		find3Numbers(arr,arr.length,12);

	}

}
