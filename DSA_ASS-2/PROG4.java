/*class PointType 
{
  int x,y;
  void setCoordinate(int x,int y){
  this.x=x;this.y=y;
}
  
int getX() 
{
  return x;
}

int getY() 
{
  return y;
}
}

class CircleType extends PointType
{
  double r;
  void findRadius(PointType p1,PointType p2) {
  r=Math.sqrt(Math.pow(p2.x-p1.x, 2)+Math.pow(p2.y-p1.y,2));
}
  
void findArea() 
{
  double area=Math.PI*r*r;
  System.out.println("Area of circle is "+area);
}
void findCircumference() 
{
  double peri= 2*Math.PI*r;
  System.out.println("Circumference is "+peri);
  
}
public class PROG4 
{

	public static void main(String[] args) 
	{
		CircleType c=new CircleType();
		CircleType c1=new CircleType();
		c.setCoordinate(0, 0);
		c1.setCoordinate(4,5);
		c.findRadius(c,c1);
		c.findArea();
		c.findCircumference();

	}

}*/
