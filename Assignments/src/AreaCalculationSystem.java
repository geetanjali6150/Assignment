
abstract class GeometricShapes
{	
	String name;
	GeometricShapes()
	{
		System.out.println("Geometric Shape");
	}
	void draw()
	{
		System.out.println("**Draw a shape**");
	}
	void sname(String name)
	{
		this.name=name;
	    System.out.println("*Name of Shape:"+name);
	}
	
}
class Rectangle extends GeometricShapes
{   
  int length;
	 int breadth;
	void area(int length,int breadth)
	{
		int area=0;
		area=length*breadth;
		System.out.println("Area Of Rectangle is:"+area);
	}
}
class Circle extends GeometricShapes
{
	 int r;
    double pi=3.14;
	void area(double r)
	{
	double area =0;
		area=pi*(r*r);
		System.out.println("Area of Circle:"+area);
	}
}
class Square extends GeometricShapes
{
	private int side;
	public void setSide(int side)
	{
		this.side= side;
	}
	public int getSide()
	{
		return side;
	}
	void area()
	{
		int area=0;
		area=side*side;
		System.out.println("Area of Square:"+area);
	}
}
public class AreaCalculationSystem 
{
public static void main(String args[])
{
Square s=new Square();
s.draw();
s.sname("Square");
s.setSide(5);
s.getSide();
s.area();
Rectangle r=new Rectangle();
r.draw();
r.sname("Rectangle");
r.area(4,2);
Circle c=new Circle();
c.sname("Circle");
c.area(2);

}
}



