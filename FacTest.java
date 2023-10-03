//WAP to find out factorial of a given number using static method

import java.util.Scanner;

class MyMath
{
	static long factorial(long num)
	{
		long fact = 1, i;
		for(i=num ; i>0 ; i--)
		{
			fact = fact*i;
		}
		return fact;
	}
}

class FacTest
{
	public static void main(String abc[])
	{
		
		Scanner sc = new Scanner(System.in);
		long num;
		System.out.println("Enter your number:");
		num = sc.nextInt();
		long fact = MyMath.factorial(num);
		System.out.println("The Factorial is: " + fact);
	}
}