
public class PROG12 
{
    public static int BinarySearchRecursion(int arr[],int low,int high,int value)
    {
    	if(low>high)
    		return -1;
    	int mid=(low+high)/2;
    	if(arr[mid]==value)
    		return mid;
    	else if(arr[mid]<value)
    		return BinarySearchRecursion(arr,mid+1,high,value);
    	else
    		return BinarySearchRecursion(arr,low,mid-1,value);
    	
    }

	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,4,5,6,7,8,9};
		System.out.println("The value is present at index "+BinarySearchRecursion(arr,0,arr.length-1,0));

	}

}
