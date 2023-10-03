//employee constructors adding

import java.util.Scanner;

class Employee
{
	int id;
	String name;
	int basic_salary;

	Employee()
	{
		id = 1;
		name = "abcd";
		basic_salary = 500;
	}
	Employee(int i, String n, int b)
	{
		id = i;
		name = n;
		basic_salary = b;
	}

	void setEmployee()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter id of the Employee:");
		id = sc.nextInt();

    	System.out.println("Enter the Name of the Employee:");
     	name = sc.next();

   		System.out.println("Enter the Basic Salary of the Employee:");
     	basic_salary = sc.nextInt();
	}

	void getEmployee()
	{
		 System.out.println("ID = " + id);
     	 System.out.println("Name is " + name);
      	 System.out.println("Basic Salary = " + basic_salary);
	}

	float gross_salary()
	{
		float da, ta, hra, gross;
		da = 0.65f *  basic_salary;
		ta = 0.10f * basic_salary;
		hra = 0.35f * basic_salary;
		gross = basic_salary + da + ta + hra;
		System.out.println("The da = " + da + " ta = " + ta + " hra = " + hra);
		return gross;
	}
}

	class EmployeeFinal2
	{
		  public static void main(String args[])
  		{
    		 Employee e1 = new Employee();
     		 e1.getEmployee();

     		 Employee e2 = new Employee();
     		 e2.setEmployee();
     		 e2.getEmployee();
     		 System.out.println("Gross Salary = " + e2.gross_salary());

 		 }
	}

