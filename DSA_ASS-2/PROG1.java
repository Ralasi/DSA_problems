import java.util.Scanner;

class Comission
{
   double sales;
   Comission(double sales)
{
   this.sales=sales;
}
   double getComission() 
{
if(sales<500) 
	return sales*0.02;
else if(sales>500 && sales<5000) 
	return sales*0.05;
else
	return sales*0.08;
}
}
public class PROG1
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sales ");
		double sales=sc.nextDouble();
		
		if(sales<0) 
			System.out.println("Invalid input");
		else 
		{
		  Comission c=new Comission(sales);
		  double r=c.getComission();
		  System.out.println("Sales is "+sales+" and the comission is "+r);
		}
		
		sc.close();


	}

}
