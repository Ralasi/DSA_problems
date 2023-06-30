
public class InsertionSort 
{
	void insertion_sort(int arr[])
	{
		int n=arr.length;
		for(int i=1;i<n;i++)
		{
			int key=arr[i];
			int j=i-1;
			while(j>=0&&arr[j]>key)
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
	}
	
	void printArray(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) 
	{
		InsertionSort is=new InsertionSort();
		int arr[]={ 12, 11, 13, 5, 6 };
		System.out.println("Before sorting");
		is.printArray(arr);
		is.insertion_sort(arr);
		System.out.println("After insertion sort");
		is.printArray(arr);

	}

}
