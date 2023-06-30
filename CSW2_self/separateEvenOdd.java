
public class separateEvenOdd 
{
	public static void swap(int arr[],int x,int y)
	{
		int temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}
	public static void seperateEvenAndOdd(int arr[],int size)
	{
		int left=0;
		int right=size-1;
		while(left<right)
		{
			if(arr[left]%2==0)
				left+=1;
			else if(arr[right]%2==1)
				right-=1;
			else
			{
				swap(arr,left,right);
				left++;
				right--;
			}
		}
	}

	public static void main(String[] args) 
	{
		int arr[]= {3,21,4,5,6,7,8,9,0,56};
		seperateEvenAndOdd(arr,arr.length);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
