package Searching;

//Java implementation of the approach
class PROG8
{
	
//Function to return the maximum element
static int findMax(int arr[], int low, int high)
{


	// If there is only one element left
	if (high == low)
		return arr[low];

	// Find mid
	int mid = low + (high - low) / 2;
//Check if mid reaches 0 ,it is greater than next element or not
if(mid==0 && arr[mid]>arr[mid+1])
{
	return arr[mid];
}


	// Decide whether we need to go to
	// the left half or the right half
	if (arr[low] > arr[mid])
	{
		return findMax(arr, low, mid - 1);
	}
	else
	{
		return findMax(arr, mid + 1, high);
	}
}

//Driver code
public static void main(String[] args)
{
	int arr[] = { 6,5,4,3,2,1 };
	int n = arr.length;
	System.out.println(findMax(arr, 0, n - 1));
}
}

