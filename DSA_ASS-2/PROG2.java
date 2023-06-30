import java.util.Scanner;

class Complex
{
  double real,img;
  void setData()
 {	  
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter real and imaginary part ");
   real=sc.nextDouble();
   img=sc.nextDouble();
}
  
void display() 
{
  System.out.println(real+" + "+img+"i");
}
void add(Complex c,Complex c1) 
{
  Complex c2=new Complex();
  c2.real=c.real+c1.real;
  c2.img=c.img+c1.img;
  System.out.println("Sum is "+c2.real+" + "+c2.img+"i");
}
}
public class PROG2 
{

	public static void main(String[] args) 
	{
		Complex c=new Complex();
		Complex c1=new Complex();
		c.setData();
		c.display();
		c1.setData();
		c1.display();
		c1.add(c, c1);

	}

}
