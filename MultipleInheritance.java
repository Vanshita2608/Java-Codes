//multiple inheritance
import java.util.*;
abstract class Figure
{
	double dim1, dim2;
	Figure(double a, double b)
	{
		dim1 = a;
		dim2 = b;
	}
	abstract double area();
}

class Rectangle extends Figure
{
	Rectangle(double a, double b)
	{
		super(a,b);
	}
	double area()
	{
		System.out.println("Inside area for rectangle: ");
		return dim1*dim2;
	}
} 

interface DrawableShape
{
	void draw();
}

class CenteredRactangle extends Rectangle implements DrawableShape
{
	int x, y;
	CenteredRactangle(double a, double b, int x, int y)
	{
		super(a,b);
		this.x = x;
		this.y = y;
	}
	void setCenter(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	int getCenterX()
	{ return x;}

	int getCenterY()
	{ return y;}

	public void draw()
	{
		System.out.print("Rectangle is drawn at center x: " + getCenterX());
		System.out.println(" and y: " + getCenterY());
	}
}
 
class MultipleInheritance
{
	public static void main(String abs[])
	{
		CenteredRactangle cr = new CenteredRactangle(3, 5, 100, 120);
		System.out.println("Area is " + cr.area());
		cr.draw();
	}
}

