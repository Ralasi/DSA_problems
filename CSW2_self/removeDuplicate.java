import java.util.Arrays;
//DOUGHT
public class removeDuplicate
{
	public static int[] remove_duplicate(int arr[],int size)
	{
		int j=0;
		Arrays.sort(arr);
		for(int i=1;i<size;i++)
		{
			if(arr[i]!=arr[j])
			{
				j++;
				arr[j]=arr[i];
			}
		}
		int[] ret=Arrays.copyOf(arr, j+1);
		return ret;
	}

	public static void main(String[] args) 
	{
		System.out.println("HII");
		int arr[]= {2,5,7,5,9};
		System.out.println(remove_duplicate(arr,arr.length-1));
	}

}
