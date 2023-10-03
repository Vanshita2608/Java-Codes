class MultiThread implements Runnable
{
	Thread t;
	MultiThread()
	{
		t = new Thread(this, "Demo");
		System.out.println("Child" + t);
		t.start();
	}
	public void run()
	{
		String str = "Hello World";
		int count = 1;

		try
		{
			for(int i=0 ; i<str.length() ; i++)
			{
				if(str.charAt(i) == ' ')
				{
					count++;
				}
				System.out.println(str.charAt(i));
				Thread.sleep(500);
			}
			System.out.println("Total = " + count);
		}
		catch(InterruptedException e)
		{
			System.out.println("Child Inter");
		}
		System.out.println("Child exitting");
	}
}
class DemoStringCheck
{
	public static void main(String BC[])
	{
		MultiThread m = new MultiThread();
	}
}