//method overriding

class A
{
	int i, j;
	A(int a, int b)
	{
		i=a;
		j=b;
	}
	void show()
	{
		System.out.println("i and j are " + i + " " + j);
	}
}


class B extends A
{
	int k;
	B(int a, int b, int c)
	{
		super(a,b);
		k = c;
	}
	void show()
	{
		System.out.println("k : " + k);
	}

}

class MethodOverride
{
	public static void main(String si[])
	{
		B subOB = new B(1, 2, 3);
		subOB.show();
	}
}