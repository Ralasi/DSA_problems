//Dought
public class RangePartition 
{
	public static void swap(int arr[],int x,int y)
	{
		int temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}
	public static void range_partation(int arr[],int size,int lower,int higher)
	{
		int start=0;
		int end=size-1;
		int i=0;
		while(i<=end)
		{
			if(arr[i]<lower)
			{
				swap(arr,i,start);
				i+=1;
				start+=1;
			}
			else if(arr[i]>higher)
			{
				swap(arr,i,end);
				end-=1;
			}
			else
			{
				i+=1;
			}
		}
	}

	public static void main(String[] args) 
	{
		int arr[]= {1,21,2,20,3,19,4,18,5,17,6,16,7,15,8,14,9,13,10,12,11};
		range_partation(arr,arr.length,9,12);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
