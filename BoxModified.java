/* Modify the given Box class by introducing setter and getter methods along with the method to calculate the volume  */

import java.util.Scanner;
class Box
{
	double width;
	double height;
	double depth;
	double vol;

	double setBox()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the values of width , height and depth :");
		width = s.nextDouble();
		height = s.nextDouble();
		depth = s.nextDouble();
		return 0;
	}

	double getBox()
	{
		System.out.println("Width is " + width);
		System.out.println("Height is " + height);
		System.out.println("Depth is " + depth);
		return 0;
	}
 
	double volume()
	{
		vol = width * height * depth;
		System.out.println("Volume is " + vol);
		return 0;
	}
}

class BoxModified
{
	public static void main(String bmd[])
	{
		Box b1 = new Box();
		b1.setBox();
		b1.getBox();
		b1.volume();
		
	}
}