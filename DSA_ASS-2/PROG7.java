interface A
{
  void display();
  void count();
}

class B implements A
{
  static int maxcount;
  String name;
  B(String name)
  {
    this.name=name;
  }
  
public void display() 
{
  System.out.println("The name of the person= "+name);
}

public void count()
{
  maxcount=name.length();
  System.out.println("The no. of characters present in the name of the person= "+maxcount);
}
}
public class PROG7 
{

	public static void main(String[] args) 
	{
		A a=new B("ITER");
		a.display();
		a.count();


	}

}
