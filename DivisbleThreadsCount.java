class DivisbleThreads implements Runnable
{
	String name;
	Thread t;
	int start, end, count;

	DivisbleThreads(String threadname, int s, int e)
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
				if(i%7==0)
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

class DivisbleThreadsCount
{
	public static void main(String abc[])
	{
		DivisbleThreads mth1 = new DivisbleThreads("First " , 1 , 100);
		DivisbleThreads mth2 = new DivisbleThreads("Second " , 101 , 200);

		try
		{
			System.out.println("Waiting");
			mth1.t.join();
			mth2.t.join();
		}
		catch(InterruptedException ie)
		{
			System.out.println("Main Thread Interrupted");
		}
		System.out.println("Exiting main");
	}
}