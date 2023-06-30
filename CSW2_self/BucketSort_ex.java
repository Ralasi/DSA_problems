
public class BucketSort_ex 
{
	public static void bucket_sort(int arr[],int lR,int uR)
	{
		int count=0;
		int range=uR-lR;
		for(int i=0;i<arr.length;i++)
		{
			count[arr[i]-lR]++;
		}
		int j=0;
		for (int i = 0; i < range; i++) {
			 for (; count[i] > 0; (count[i])--) {
			 arr[j++] = i + lR;
			 }
			 }
	}

	public static void main(String[] args) 
	{
		

	}

}
