package Searching;

import java.util.HashMap;

public class PROG1_usingHashMap
{
	public static int firstRepeated(int arr[],int size)
	{
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		{
			for(int i=0;i<size;i++)
			{
				if(hm.containsKey(arr[i]))
					hm.put(arr[i], 2);
				else
					hm.put(arr[i], 1);
			}
			for(int i=0;i<size;i++)
			{
				if(hm.get(arr[i])==2)
				{
					return arr[i];
				}
					
			}
			return 0;
		}
	}

	public static void main(String[] args) 
	{
		int arr[]= {2,6,4,6,5,5};
		System.out.println(firstRepeated(arr,arr.length));

	}

}
