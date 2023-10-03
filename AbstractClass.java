//abstract class


abstract class Figure
{
	double dim1, dim2;
	Figure(double a, double b)
	{
		dim1 = a;
		dim2 = b;
	}
	abstract double area();
	//{
		/*System.out.println("Area for figure is undefined:");
		return 0;*/
	//}
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
class Triangle extends Figure
{
	Triangle(double a, double b)
	{
		super(a,b);
	}
	double area()
	{
		System.out.println("Inside area for triangle: ");
		return dim1*dim2 / 2;
	}
}
class AbstractClass
{
	public static void main(String hirt[])
	{
		//Figure f = new Figure(10, 10);
		Rectangle r = new Rectangle(9, 5);
		Triangle t = new Triangle(10, 8);
		Figure fig_ref;

		fig_ref = r;
		System.out.println("Area is: " + fig_ref.area());
		
		fig_ref = t;
		System.out.println("Area is: " + fig_ref.area());
		

		/*fig_ref = f;
		System.out.println("Area is: " + fig_ref.area());*/
	}
}