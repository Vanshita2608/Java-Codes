import java.util.Scanner;
import MyPackage.*;

class Experience
{
	public static void main(String args[])
	{
		int id, exp, salary;
		String name;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter id, name, salary, exp of employee: ");
		id = sc.nextInt();
		name = sc.next();
		salary = sc.nextInt();
		try
		{
			exp = sc.nextInt();

			if(exp < 0 || exp > 50)
			{
				throw new EmpExpException(exp);
			}
		}
		catch(EmpExpException e)
		{
			System.out.println(e);
		}
	}
}