//pt Q3.a

import java.util.Scanner;
class TaxiMeter
{
	String taxi_no, driver_name, pass_name;
	float km_travelled;

	void setTM()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter taxi number:");
		taxi_no = sc.next();
		System.out.println("Enter driver name:");
		driver_name = sc.next();
		System.out.println("Enter passenger name:");
		pass_name = sc.next();
		System.out.println("Enter distance travelled in kilometers:");
		km_travelled = sc.nextFloat();
	}
	void getTM()
	{
		System.out.println("Taxi number = " + taxi_no);
		System.out.println("Driver name = " + driver_name);
		System.out.println("Passenger name = " + pass_name);
		System.out.println("Distance travelled in kilometers = " + km_travelled);
	}
	double taxi_bill()
	{
		double bill = 0.0;
		if(km_travelled <= 50)
		{
			bill = km_travelled * 25;
		}
		else if(km_travelled > 50 && km_travelled <= 100)
		{
			bill = km_travelled * 20;
		}
		else if(km_travelled > 100 && km_travelled <= 200)
		{
			bill = km_travelled * 15;
		}
		else if(km_travelled > 200 && km_travelled <= 350)
		{
			bill = km_travelled * 12;	
		}
		else
		{
			bill = km_travelled * 10;
		}

		double total_bill = bill + 0.05 * bill;
		return total_bill;
	}
}

class MainTestPTq3a
{
	public static void main(String abc[])
	{
		Scanner sc = new Scanner(System.in);
		int n, i;
		System.out.println();
		System.out.println("How many taxi's detials would you like to enter?:");
		n = sc.nextInt();

		TaxiMeter tm[] = new TaxiMeter[n];
		for(i=0 ; i<n ; i++)
		{
			tm[i] = new TaxiMeter();
			tm[i].setTM();
		}
		double sum = 0;
		for(i=0 ; i<n ; i++)
		{
			double total = tm[i].taxi_bill();
			System.out.println("The total price for taxi " + (i+1) + " is = " + total);
			sum = sum + total;
		}
	}
}