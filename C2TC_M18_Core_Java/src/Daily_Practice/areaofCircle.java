
package Daily_Practice;

import java.util.Scanner;

class Area
{
	public String area;
	void radious(double area)
	{
		double radious = 0;
		area = 3.14*radious*radious;
	}
	void color()
	{
		
	}
}
class AreaOfCircle 
{
   public static void main(String args[]) 
    {   
      Scanner s= new Scanner(System.in);
      s.close();
      int radious = 0;
	System.out.println("Enter the radius:"+radious);
      Area  a=new Area();
      System.out.println("Area of Circle is: " + a.area);      
   }
 }