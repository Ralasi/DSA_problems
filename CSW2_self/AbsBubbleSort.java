
public class AbsBubbleSort 
{
	public static void swap(int arr[],int x,int y)
	{
		int temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}
	public static boolean AbsMore(int value1,int value2,int ref)
	{
		return(Math.abs(value1-ref)>Math.abs(value2-ref));
	}
	public static void absBubbleSort(int arr[],int n,int ref)
	{
		for(int i=0;i<n-1;i++)
			for(int j=0;j<n-i-1;j++)
			{
				if(AbsMore(arr[j],arr[j+1],ref))
				{
					swap(arr,j,j+1);
				}
			}
	}

	public static void main(String[] args) 
	{
		int arr[] = { 9, 1, 8, 2, 7, 3, 6, 4, 5 };
		absBubbleSort(arr,arr.length,5);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}


	}

}
