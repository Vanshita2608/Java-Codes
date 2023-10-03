/*consider class "Box". Another class "BoxWeight" inherits BOX and having unique properties ie. weight
  write an application to test the functionality of given hierarchy of classes */

class Box
{
	double width;
	double height;
	double depth; 

	Box()
	{ }

	Box(double w, double h, double d)
	{
		width = w;
		height = h;
		depth = d;
	}

	void getBox()
	{
		System.out.println("Width is " + width);
		System.out.println("Height is " + height);
		System.out.println("Depth is " + depth);
	}

	double volume()
	{
		return width*height*depth;
	}
}

class BoxWeight extends Box
{
	double weight;
	BoxWeight(double w, double h, double d, double m)
	{
		width = w;
		height = h;
		depth = d;
		weight = m;
	}
	void getWeight()
	{
		System.out.println("Weight is " + weight);
	}
}

class BoxMainSI
{
	public static void main(String bm[])
	{
		BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
		
		mybox1.getBox();
		mybox1.getWeight();

		double vol;
		vol = mybox1.volume();
		System.out.println("Volume is: " + vol);
	}
}