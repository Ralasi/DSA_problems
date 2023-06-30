
public class GCD 
{
	public static int gcd(int a,int b)
	{
		if(a==0)
			return b;
		return gcd(b%a,a);
	}
	
	public static int findGCD(int arr[],int size)
	{
		int result=arr[0];
		for(int element:arr)
		{
			result=gcd(result,element);
			if(result==1)
			{
				return 1;
			}
		}
		return result;
	}

	public static void main(String[] args) 
	{
		int arr[] = { 2, 4, 6, 8, 16 };
        System.out.println(findGCD(arr, arr.length));

	}

}
