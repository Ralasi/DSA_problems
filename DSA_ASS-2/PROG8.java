import java.util.Scanner;

interface EmpInterface
{
  void displayEmp();
  void giveBonus(double amount);
}

abstract class Employee
{
  int empID;
  String fname;
  String lname;
  double salary;
  Employee(int empID, String fname,String lname,double salary)
  {
    this.empID=empID;
    this.fname=fname;
    this.lname=lname;
    this.salary=salary;
}
}

class Manager extends Employee implements EmpInterface
{
double bonus;
Manager(int empID, String fname,String lname,double Salary)
{
  super(empID,fname,lname,Salary);
}

public void displayEmp() 
{
  System.out.println("EmpId is "+empID);
  System.out.println("The name of employee is "+fname+" "+lname);
  System.out.println("Salary of the employee is "+salary);
}

public void giveBonus(double amount)
{
	bonus=amount;
	salary+=bonus;
  System.out.println("Salary after bonus "+salary);
}
}
public class PROG8 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		EmpInterface [] e=new EmpInterface[1];
		int eId;
		String fname,lname;
		double sal,amt;
		
		for(int i=0;i<1;i++) 
		{
		System.out.println("Enter the empId");
		eId=sc.nextInt();
		System.out.println("Enter first name");
		fname=sc.next();
		System.out.println("Enter last name");
		lname=sc.next();
		System.out.println("Enter the salary");
		sal=sc.nextDouble();
		System.out.println("Enter the bonus");
		amt=sc.nextDouble();
		
		e[i]=new Manager(eId,fname,lname,sal);
		e[i].displayEmp();
		
		if(amt>0) 
		{
			e[i].giveBonus(amt);
			
		}
		else 
			System.out.println("Couldn't give bonus....Invalid input!!!");
		System.out.println();
		}
		
		sc.close();

	}
	
}
