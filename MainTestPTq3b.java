//pt Q3.b

import java.util.Scanner;
class Person
{
	String name;
	char gender;

	void setPerson()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name:");
		name = sc.next();
		System.out.println("Enter gender:");
		gender = sc.next().charAt(0);
	}
	void getPerson()
	{
		System.out.println("Name = " + name);
		System.out.println("Gender = " + gender);
	}
}

class Learner extends Person
{
	int id, sem, m1, m2;
	String branch;

	void setLearner()
	{
		System.out.println();
		System.out.println("__LEARNER DATA__");
		setPerson();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id:");
		id = sc.nextInt();
		System.out.println("Enter semester:");
		sem = sc.nextInt();
		System.out.println("Enter marks of subject 1:");
		m1 = sc.nextInt();
		System.out.println("Enter marks of subject 2:");
		m2 = sc.nextInt();
		System.out.println("Enter branch name:");
		branch = sc.next();
	}
	void getLearner()
	{
		getPerson();
		System.out.println("ID = " + id);
		System.out.println("Semester = " + sem);
		System.out.println("Marks of subject 1 = " + m1 + " and subject 2 = " + m2);
		System.out.println("Branch = " + branch);
	}
	void maxMarks()
	{
		if(m1>m2)
		{
			System.out.println("Marks of subject 1 is greater than marks of subject 2");
		}
		else
		{
			System.out.println("Marks of subject 2 is greater than marks of subject 1");
		}
	}
}

class Tutor extends Person
{
	String department;
	float b_salary,experience;

	void setTutor()
	{
		System.out.println();
		System.out.println("__TUTOR DATA__");
		setPerson();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter department:");
		department = sc.next();
		System.out.println("Enter experience in years:");
		experience = sc.nextFloat();
		System.out.println("Enter basic salary:");
		b_salary = sc.nextFloat();
	}
	void getTutor()
	{
		getPerson();
		System.out.println("Department = " + department);
		System.out.println("Experience = " + experience + "yrs");
		System.out.println("Basic Salary = " + b_salary);
	}
	double calNetSalary()
	{
		double gross = b_salary + 0.76 * b_salary + 0.125 * b_salary + 0.38 * b_salary;
		double netsal = gross - 0.05 * gross;
		return netsal;
	}
}

class MainTestPTq3b
{
	public static void main(String abc[])
	{
		Learner L = new Learner(); 
		L.setLearner();
		L.getLearner();
		L.maxMarks(); 

		Tutor T = new Tutor();
		T.setTutor();
		T.getTutor();
		//T.calNetSalary();
		double ns = T.calNetSalary();
		System.out.println("Net salary is = " + ns);
	}
}