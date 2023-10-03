//interface

interface FigureI
{
	double area();
}
class Rectangle implements FigureI
{
	double dim1, dim2;
	Rectangle(double a, double b)
	{
		dim1 = a;
		dim2 = b;
	}
	public double area()
	{
		System.out.println("Inside area of Rectangle: ");
		return dim1*dim2;
	}
}

class Triangle implements FigureI
{
	
	double dim1, dim2;
	Triangle(double a, double b)
	{
		dim1 = a;    //base
		dim2 = b;    //height
	}
	public double area()
	{
		System.out.println("Inside area of triangle: ");
		return dim1*dim2 / 2;
	}
}
class InterfaceDemo
{
	public static void main(String ifd[])
	{
		Rectangle r = new Rectangle(9, 5);
		Triangle t = new Triangle(10, 8);
		FigureI fig_ref;

		fig_ref = r;
		System.out.println("Area is: " + fig_ref.area());
		
		fig_ref = t;
		System.out.println("Area is: " + fig_ref.area());
	}
}