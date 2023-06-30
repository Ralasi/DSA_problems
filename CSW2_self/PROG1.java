
public class PROG1 
{
	static int maxSubArray(int arr[],int size)
	{
		int maxSoFar=0;
		int maxEndingHere=0;
		for(int i=0;i<size;i++)
		{
			maxEndingHere=maxEndingHere+arr[i];
			if(maxEndingHere<0)
				maxEndingHere=0;
			if(maxSoFar<maxEndingHere)
				maxSoFar=maxEndingHere;
			
		}
		return maxSoFar;
	}

	public static void main(String[] args) 
	{
	    int arr[]= {3,6,2,10};
	    maxSubArray(arr,arr.length);

	}

}

