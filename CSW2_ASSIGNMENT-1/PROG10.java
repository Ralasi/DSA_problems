
public class PROG10 
{
   public static int calculateGCD(int a, int b) 
   {
      if (a == b) 
      {
         return a;
      } 
      else if (a == 0) 
      {
         return b;
      } 
      else if (b == 0) 
      {
         return a;
      } 
      else if (a > b) 
      {
         return calculateGCD(a % b, b);
      } 
      else 
      {
         return calculateGCD(a, b % a);
      }
}
  public static void main(String[] args) 
  {
     int a = 63;
     int b = 21;
     System.out.println(calculateGCD(a, b));
  }
}
