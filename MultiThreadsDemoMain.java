class MultiThreads implements Runnable
{ 
  Thread t;
  MultiThreads(String t_name)
    {
      t=new Thread(this,t_name);
      System.out.println("Child thread" + t);
      t.start();
    }
  public void run()
    {
      try 
        {
          for(int i=1;i<6;i++)
            {
              Thread th=Thread.currentThread();
              System.out.println(th.getName()+"->" + i);
              Thread.sleep(1000);
            }
        }
      catch(InterruptedException e)
        {
          System.out.println("Child Interrupted");
        }
          System.out.println("Exiting child thread");
     }
}
   class MultiThreadsDemoMain
{ 
  public static void main(String args[])
    {
      MultiThreads ob1 = new MultiThreads("One");
      MultiThreads ob2 = new MultiThreads("Two");
      MultiThreads ob3 = new MultiThreads("Three");
      System.out.println("Thread One is alive " + ob1.t.isAlive());
      System.out.println("Thread Two is alive " + ob2.t.isAlive());
      System.out.println("Thread Three is alive " + ob3.t.isAlive());
         try 
            {
              //for(int i=1;i<6;i++)
                //{
                 // System.out.println("Main Thread " + i);
                  //Thread.sleep(10000);
                  ob1.t.join();
                  ob2.t.join();
                  ob3.t.join();
                }
           // }
          catch(InterruptedException e)
            {
               System.out.println("Main thread Interrupted");
            }
              System.out.println("Thread One is alive " + ob1.t.isAlive());
              System.out.println("Thread Two is alive " + ob2.t.isAlive());
              System.out.println("Thread Three is alive " + ob3.t.isAlive());
              System.out.println("Main thread exiting");
     }
  }