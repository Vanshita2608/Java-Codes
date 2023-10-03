// WAP to convert fron farhenhiet to celcius
/* Formula....C = F-32
                  ----
                  1.8      */



class Temperature
{
	public static void main(String temp[])
	{
		float C , F = 100;
		C = ((float)F-32)/(float)1.8;
		System.out.println("Answer is = " + C);
	}
}