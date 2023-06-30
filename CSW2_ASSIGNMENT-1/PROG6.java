
public class PROG6
{ 
	public static int  maxSubArraySum(int arr[],int size)
	{
		int maxSoFar=0;
	    int maxEndingHere=0;
		for(int i=0;i<size;i++)
		{
			maxEndingHere=maxEndingHere+arr[i];
			if(maxEndingHere<0)
			{
				maxEndingHere=0;
			}
			if(maxSoFar<maxEndingHere)
			{
				maxSoFar=maxEndingHere;
			}
		}
		return maxSoFar;
		
	}

	public static void main(String[] args) 
	{
		int arr[]= {1,-2,3,4,-4,6,-4,3,2};
		System.out.println("max sub array sum "+maxSubArraySum(arr,9));

	}

}

