//single level inheritance

class A
{
	int i, j;

	void showij()
	{
		System.out.println("i and j : " + i + " " + j);
	}
}

class B extends A
{
	int k;

	void showk()
	{
		System.out.println("k : " + k);
	}
	void sum()
	{
		System.out.println("i, j and k : " + (i+j+k));
	}
}

class SingleInheritance
{
	public static void main(String si[])
	{
		A superOB = new A();
		B subOB = new B();

		superOB.i = 10;
		superOB.j = 20;

		System.out.println("Contents of superOB: ");
		superOB.showij();

		subOB.i = 7;
		subOB.j = 8;
		subOB.k = 9;

		System.out.println("Contents of subOB: ");
		subOB.showij();
		subOB.showk();
		System.out.println();
		System.out.println("Sum of i, j and k in subOB is: ");
		subOB.sum();

	}
}