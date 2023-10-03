//class object
import java.util.Scanner;
class Box
{
	double width;
	double height;
	double depth;
}

class BoxUserInput
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		Box b = new Box();

		double h = b.height;
		double w = b.width;
		double d = b.depth;

		System.out.println("Enter your values: ");
		h = s.nextInt();
		w = s.nextInt();
		d = s.nextInt();
		double vol;
		vol = h*w*d;
		System.out.println("Volume is " + vol);
	}
}