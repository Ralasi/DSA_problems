
public class PROG11
{
	public static void swap(char[] chars,int i,int j)
	{
		char temp=chars[i];
		chars[i]=chars[j];
		chars[j]=temp;
	}
	public static void permutations(char[] arr,int k)
	{
		if(k==arr.length-1)
		{
			System.out.println(String.valueOf(arr));
		}
		for(int i=k;i<arr.length;i++)
		{
			swap(arr,k,i);
			permutations(arr,k+1);
			swap(arr,k,i);
		}
	}
	public static void FindPermuation(String str)
	{
		if(str==null||str.length()==0)
		{
			return;
		}
		permutations(str.toCharArray(),0);
	}

	public static void main(String[] args)
	{
		String str="123";
		FindPermuation(str);
	}
}	


