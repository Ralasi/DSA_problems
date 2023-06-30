class genericbox<T>
{
	T a,b;
	genericbox(T a,T b)
	{
		this.a=a;
		this.b=b;
	}
	void display()
	{
		System.out.println(a+" "+b);
	}
}
public class PROG4 
{

	public static void main(String[] args) 
	{
		genericbox<String> obj=new genericbox<String>("hhh","aaa");
		obj.display();
		
		genericbox<Integer> obj2=new genericbox<Integer>(34,67);
		obj2.display();
		
		genericbox<Object> obj3=new genericbox<Object>("ss","ww");
		obj3.display();

	}

}
