import java.util.*;
public class PROG5 
{
	static void rightRotate(int a[],int n,int k)
	{
		k=k%n;
		for(int i=0;i<n;i++)
		{
			if(i<k)
			{
				System.out.print(a[n+i-k]+" ");
			}
			else
			{
				System.out.print(a[i-k]+" ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,4,5};
		int N=arr.length;
		int K=2;
		rightRotate(arr,N,K);
	}

}
