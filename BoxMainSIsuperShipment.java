//shipment added

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
		super(w,h,d);
		weight = m;
	}
	void getWeight()
	{
		System.out.println("Weight is " + weight);
	}
}

class Shipment extends BoxWeight
{
	double cost;
	Shipment(double w, double h, double d, double m, double c)
	{
		super(w,h,d,m);
		cost = c;
	}
	void costCal()
	{
		System.out.println("Cost is " + cost);
	}
	
}

class BoxMainSIsuperShipment
{
	public static void main(String bm[])
	{
		Shipment mybox1 = new Shipment(10, 20, 15, 34.3, 430000);
		
		mybox1.getBox();
		mybox1.getWeight();
		mybox1.costCal();

		double vol;
		vol = mybox1.volume();
		System.out.println("Volume is: " + vol);
	}
}