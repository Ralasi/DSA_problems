/*Write a Java method for finding the smallest and largest numbers in an array of integers and 
compare that to a java method that would do the same thing.*/


public class PROG6 
{

	public static void findMaxMin(int a[],int n)
	{
		int max=a[0],min=a[0];
		for(int i=1;i<n;i++)
		{
			if(max<a[i])
				max=a[i];
			if(max>a[i])
				min=a[i];
		}
		System.out.println("max= "+max);
		System.out.println("Min= "+min);
	}
	public static void main(String[] args)
	{
		int x[]= {2,3,5,1,7,12,9};
		int n=x.length;
		findMaxMin(x,n);
		//Using predefined methord
		int max=x[0];
		int min=x[0];
		for(int i=1;i<n;i++)
		{
			max=Math.max(max,x[i]);
		}
		System.out.println("Max(Max using max function)= "+max);
		for(int i=1;i<n;i++)
		{
			min=Math.min(min,x[i]);
		}
		System.out.println("Min(using math function)="+min);
		

	}

}
