/*     write a multithreaded program to display even and odd numbers between 1-50.
1 thread should display even numbers and another one should display odd numbers     */


class EvenThread implements Runnable
{
	String name;
	Thread t;
	int start, end;
	int count;

	EvenThread(String threadname, int s, int e)
	{
		name = threadname;
		t = new Thread(this, name);
		System.out.println("Child Thread " + t);
		start = s;
		end = e;
		t.start();
	}

	public void run()
	{
		try
		{
			for(int i=start ; i<=end ; i++)
			{
				if(i%2==0)
				{
					System.out.println(t.getName() + "--->" + i);
					count++;
				}
				
				Thread.sleep(50);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(name + "Interrupted");
		}
		System.out.println("Count of " + name + " = " + count);
		System.out.println(name + "exiting");
	}
}

class OddThread implements Runnable
{
	String name;
	Thread t;
	int start, end;
	int count;

	OddThread(String threadname, int s, int e)
	{
		name = threadname;
		t = new Thread(this, name);
		System.out.println("Child Thread " + t);
		start = s;
		end = e;
		t.start();
	}

	public void run()
	{
		try
		{
			for(int i=start ; i<=end ; i++)
			{
				if(i%2!=0)
				{
					System.out.println(t.getName() + "--->" + i);
					count++;
				}
				
				Thread.sleep(50);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(name + "Interrupted");
		}
		System.out.println("Count of " + name + " = " + count);
		System.out.println(name + "exiting");
	}
}

class EvenOddMainThread
{
	public static void main(String abc[])
	{
		EvenThread eTH = new EvenThread("Even " , 1 , 50);
		OddThread oTH = new OddThread("Odd " , 1 , 50);

		try
		{
			System.out.println("Waiting");
			eTH.t.join();
			oTH.t.join();
		}
		catch(InterruptedException ie)
		{
			System.out.println("Main Thread Interrupted");
		}
		System.out.println("Total count = " + (eTH.count + oTH.count));
		System.out.println("Exiting main");
	}
}