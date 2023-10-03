// WAP to calculate delta of a quadrant equation

class Delta
{
	public static void main(String eqn[])
	{
		int a = 2 , b = 6 , c = 1;
		float delta;

		delta = (float)((b*b) - (4*a*c));
		
		System.out.println("Answer = " + delta);
	}
}