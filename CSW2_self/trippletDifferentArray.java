
public class trippletDifferentArray 
{
	public static boolean findTripplet(int arr1[],int arr2[],int arr3[],int m,int n,int o,int val)
	{
		for(int i=0;i<m;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				for(int k=j+1;k<o;k++)
				{
					if(arr1[i]+arr2[j]+arr3[k]==val)
					{
						System.out.println("Pair is: "+arr1[i]+","+arr2[j]+","+arr3[k]);
						return true;
					}
				}
			}
		}
		System.out.println("Not found");
		return false;
	}

	public static void main(String[] args) 
	{
		int arr1[]= {3,6,8,2,5};
		int arr2[]= {9,5,2,4,4,1};
		int arr3[]= {-8,6,0,4};
		findTripplet(arr1,arr2,arr3,arr1.length,arr2.length,arr3.length,4);

	}

}
