import java.util.*;
abstract class Shape
{
  abstract void area();
}

class Square extends Shape
{
  double side;
  Square(double side)
  {
    this.side=side;
  }
  void area() 
  {
    double ar=side*side;
    System.out.println("Area of circle= "+ ar);
  }
}

class Triangle extends Shape 
{
	
  float base,height;
  Triangle(float base,float height)
  {
	 this.base=base;
     this.height=height;
  }
  void area() 
  {
    double ar=0.5*base*height;
    System.out.println("Area of triangle= "+ar);
  }
}

class Circle extends Shape
{
  double r;
  Circle(double r)
  {
    this.r=r;
  }
  void area() 
  {
    double ar=Math.PI*r*r;
    System.out.println("Area of circle= "+ar);
  }
}

public class PROG6 
{

	public static void main(String[] args) 
	{
		Shape s=new Square(2);
		s.area();
		Shape t=new Triangle(3,4);
		t.area();
		Shape c=new Circle(5);
		c.area();

	}

}
