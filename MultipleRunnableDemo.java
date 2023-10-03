class NewRunnableThread implements Runnable
{
	/*
	NewThread()
	{
		super("Demo Thread");
		System.out.println("Child Thread " + this);
		start();
	}*/
	Thread t;

	NewRunnableThread(String name)
	{
		t = new Thread(this, name);
		System.out.println(t);
		t.start();
	}
	public void run()
	{
		try
		{
			for(int i=5; i>0; i--)
			{
				System.out.println(t.getName() + "--> "+ i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e)
		{
			System.out.print("Child Thread Interrupted");
		}
		System.out.println("Exitting Child Thread");
	}
}
class MultipleRunnableDemo
{
	public static void main(String args[])
	{
		new NewRunnableThread("One");
		new NewRunnableThread("Two");
		new NewRunnableThread("Three");
		try
		{
			for(int i=5; i>0; i--)
			{
				Thread th = Thread.currentThread();
				System.out.println(th.getName() + "-->" + i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.print("Main Thread Interrupted");
		}
		System.out.println("Exitting Main Thread");
	}
}