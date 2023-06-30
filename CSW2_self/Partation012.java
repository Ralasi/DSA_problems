
public class Partation012 
{
	public static void swap(int arr[],int x,int y)
	{
		int temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}
	public static void partation012(int arr[],int size)
	{
		int left=0;
		int right=size-1;
		int i=0;
		while(i<=right)
		{
			if(arr[i]==0)
			{
				swap(arr,i,left);
				i+=1;
				left+=1;
			}
			else if(arr[i]==2)
			{
				swap(arr,i,right);
				right-=1;
			}
			else
			{
				i+=1;
			}
		}
	}

	public static void main(String[] args) 
	{
		int arr[]= { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
		partation012(arr,arr.length);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
