
public class PROG3 
{
	static int revNumber(int num)
	{
		int rev_num=0;
		while(num>0) 
		{
			rev_num=rev_num*10+num%10;
			num=num/10;
		}
		return rev_num;
	}

	public static void main(String[] args) 
	{
		int num=1256;
		System.out.println("The reverse of the number is "+revNumber(num));

	}

}
