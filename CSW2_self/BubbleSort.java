
public class BubbleSort 
{
	void bubble_sort(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n-1;i++)
			for(int j=0;j<n-i-1;j++)
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
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
		BubbleSort bs=new BubbleSort();
		int arr[]={ 64, 34, 25, 12, 22, 11, 90 };
		System.out.println("Before sorting");
		bs.printArray(arr);
		bs.bubble_sort(arr);
		System.out.println("After sorting");
		bs.printArray(arr);

	}

}
