import java.io.*;

class BRReadLinesUserInputAdd 
{
	public static void main(String args[]) throws IOException
	{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first number: ");
		int num1 = Integer.parseInt(br.readLine());
		System.out.println("Enter second number: ");
		int num2 = Integer.parseInt(br.readLine());
		int sum = num1+num2;
		System.out.println("ANSWER = " +  sum);








		/*String str;
		System.out.println("Enter lines of text.");
		System.out.println("Enter 'stop' to quit.");
		do 
		{
			str = br.readLine();
			System.out.println(str);
		} 
		while(!str.equals("stop"));*/
	}
}