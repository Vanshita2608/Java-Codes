//employee

import java.util.Scanner;

class Employee
{
	int id;
	String name;
	int basic_salary;
	float gross;

	void setEmployee()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter id of the Employee:");
		id = sc.nextInt();

    	System.out.println("Enter the Name of the Employee:");
     	name = sc.next();

   		System.out.println("Enter the Basic Salary of the Employee:");
     	basic_salary = sc.nextInt();

     	System.out.println();
	}

	void getEmployee()
	{
		 System.out.println("ID = " + id);
     	 System.out.println("Name is " + name);
      	 System.out.println("Basic Salary = " + basic_salary);
	}

	void gross_salary()
	{
		float da, ta, hra, gross;
		da = 0.65f *  basic_salary;
		ta = 0.10f * basic_salary;
		hra = 0.35f * basic_salary;
		gross = basic_salary + da + ta + hra;
		System.out.println("The da = " + da + " ta = " + ta + " hra = " + hra);
	}
}

	class EmployeeAOB
	{
		  public static void main(String args[])
  		{
    		 Scanner sc = new Scanner(System.in);
    		 int  i,n;
   			 System.out.println("How many elements do you want to enter:");
   			 n = sc.nextInt();
    		 Employee e[] = new Employee[n];
    		 for(i=0 ; i<n ; i++)
    		 {
    		 	System.out.println("Enter the data for employee no " + (i+1));
    		 	e[i] = new Employee();
    		 	e[i].setEmployee();
    		 }

    		 for(i=0 ; i<n ; i++)
    		 {
    		 	e[i].gross_salary();
    		 }
    		 System.out.println("Employees data are as follows:");
    		 for(i=0 ; i<n ; i++)
    		 {
    		 	System.out.println();
    		 	System.out.println("Data of employees:" + (i+1));
    		 	e[i].getEmployee();
    		 }
 		 }
	}
