package Searching;

class PROG9
{
	
//Function to return the maximum element
static int findMin(int arr[], int low, int high)
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
	if (arr[low] < arr[mid])
	{
		return findMin(arr, low, mid - 1);
	}
	else
	{
		return findMin(arr, mid + 1, high);
	}
}

//Driver code
public static void main(String[] args)
{
	int arr[] = { 6,5,4,3,2,1,0 ,-2};
	int n = arr.length;
	System.out.println(findMin(arr, 0, n - 1));
}
}

