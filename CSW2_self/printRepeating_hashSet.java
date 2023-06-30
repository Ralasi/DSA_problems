import java.util.HashSet;

public class printRepeating_hashSet 
{

	public static void main(String[] args)
	{
		int arr[]= {2,4,7,4,8};
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(hs.contains(arr[i]))
				System.out.print(arr[i]+" ");
			else
				hs.add(arr[i]);
		}

	}

}
