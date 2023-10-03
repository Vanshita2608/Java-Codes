//class object

class Box
{
	double width;
	double height;
	double depth;
}

class BoxDemo
{
	public static void main(String args[])
	{
		Box mybox = new Box();
		Box mybox2 = new Box();
		Box mybox3 = new Box();
		double vol;
		double vol2;
		double sum;


		//volume 1 object 1
		mybox.width = 10;
		mybox.height = 20;
		mybox.depth = 15;
		vol = mybox.width * mybox.height * mybox.depth;
		System.out.println("Volume 1 is " + vol);


		//volume 2 object 2
		mybox.width = 20;
		mybox.height = 30;
		mybox.depth = 10;
		vol2 = mybox.width * mybox.height * mybox.depth;
		System.out.println("Volume 2 is " + vol2);


		//summation object 3
		mybox.width = 25;
		mybox.height = 25;
		mybox.depth = 25;
		sum = mybox.width + mybox.height + mybox.depth;
		System.out.println("Summation is " + sum);


		//finding address
		System.out.println(mybox);
		System.out.println(mybox2);
		System.out.println(mybox3);
	}
}