//try and catch

class Exc1
{
	public static void main(String abc[])
	{
		int d, a;
		try
		{
			d = 0;
			a = 42/d;
			System.out.println("End of try");
		}

		catch(ArithmeticException e)
		{
			System.out.println("Division by zero");
		}

		System.out.println("After catch statement");
	}	
}