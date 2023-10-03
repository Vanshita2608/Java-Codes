/* WAP to calculate simple interest 
   I = P R N
      -------
   	    100          */



import java.util.Scanner;

class SimpleInterest
{
	public static void main(String si[])
	{
		int P,N;
		float R,SI;

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the values of P,R and N :");
		P = s.nextInt();
		R = s.nextFloat();
		N = s.nextInt();

		SI = (P*R*N)/100f;

		System.out.println("Simple Interest is :" + SI);
	}
}