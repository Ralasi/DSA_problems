
public class MaxSubArraySum 
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
		int arr[]= {5,5,10,100,10,5};
		System.out.println("max sub array sum "+maxSubArraySum(arr,arr.length));

	}

}
