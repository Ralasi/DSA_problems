
public class Partation01 
{
	public static int partation01(int arr[],int size)
	{
		int count=0;
		int left=0;
		int right=size-1;
		while(left<right)
		{
			while(arr[left]==0)
				left+=1;
			while(arr[right]==1)
				right-=1;
			if(left<right)
			{
				int temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				count+=1;
			}
		}
		return count;
	}

	public static void main(String[] args) 
	{
		int arr[]=  { 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1 };
		partation01(arr,arr.length);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		

	}

}
