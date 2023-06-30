class generic
{
	static<T> void array(T[] input)
	{
		for(int i=0;i<input.length;i++)
		{
			System.out.println(input[i]+" ");
			System.out.println();
		}
	}
}
public class PROG5 
{

	public static void main(String[] args) 
	{
		generic obj=new generic();
		Integer[] i= {1,2,3,4,5};
		String[] s= {"London","Paris","New York","Duabi"};
		obj.<Integer>array(i);
		obj.<String>array(s);

	}

}
