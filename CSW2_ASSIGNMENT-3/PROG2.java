
public class PROG2 
{
	public static void Partation012(int arr[],int size)
	{
		int left=0;
		int right=size-1;
		int i=0;
		while(i<=right)
		{
			if(arr[i]==0)
			{
				swap(arr,i,left);
				left++;
				i++;
			}
			else if(arr[i]==2)
			{
				swap(arr,i,right);
				right--;
			}
			else
			{
				i++;
			}
		}
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
			System.out.print(arr[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) 
	{
		int arr[]= {2,0,1,1,2,0,0,2};
		Partation012(arr,arr.length);
		printArray(arr);

	}

}
