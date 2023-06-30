
public class occuranceOfNumber
{
	public static int getKeyNumber(int arr[],int size,int key)
	{
		int count=0;
		for(int i=0;i<size;i++)
		{
			if(arr[i]==key)
			{
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) 
	{
		int arr[]= {5,7,3,5,8,2,8};
		System.out.println("Get key value: "+getKeyNumber(arr,arr.length,2));

	}

}
