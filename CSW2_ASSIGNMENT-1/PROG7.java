
public class PROG7 
{
	public static void WaveArray(int arr[])
	{
		int size=arr.length;
		for(int i=1;i<size;i+=2)
		{
			if((i-1)>=0&&arr[i]>arr[i-1])
			{
				int temp=arr[i];
				arr[i]=arr[i-1];
				arr[i-1]=temp;
			}
			if((i+1)<size&&arr[i]>arr[i+1])
			{
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
	}

	public static void main(String[] args) 
	{
		int arr[]= {8, 1, 2, 3, 4, 5, 6, 4, 2};
		WaveArray(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}



	}

}
