
public class PROG8 
{
	public static void indexArray(int arr[],int size)
	{
		for(int i=0;i<size;i++)
		{
			while(arr[i]!=-1 && arr[i]!=i)
			{
				int temp=arr[i];
				arr[i]=arr[temp];
				arr[temp]=temp;
			}
		}
	}

	public static void main(String[] args) 
	{
		int arr[]={8, -1, 6, 1, 9, 3, 2, 7, 4, -1};
		int size=arr.length;
		indexArray(arr,size);
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
