/*      Define a class named PERSON having name and age of a person. 
		Define a class named STUDENT which inherits class PERSON having student id_no, branch and marks of three subjects. 
		Design a method to display total marks of a student.
	    Define another class named FACULTY which inherits class PERSON having experience and numer of working hours in a month as data members. 
	    Design a method to calculate the salary of the faculty [rate per hour of a lecture = 300rs]. 
	    Provide necessary setter() and getter() methods. 
	    Write a java application to test the functionality of the given hierarchy of classes             
*/

import java.util.Scanner;

class Person
{
	String name;
	int age;
	static Scanner sc = new Scanner(System.in);
	
	void setPerson()
	{
		System.out.print("Enter the name:");
		name = sc.next();
		System.out.print("Enter the age:");
		age = sc.nextInt();
	}
	void getPerson()
	{
		System.out.println();
		System.out.println("Name is:" + name);
		System.out.println("Age is:" + age);
	}
}

class Student extends Person
{
	int id, m1, m2, m3;
	String branch;

	void setStudent()
	{
		System.out.println();
		System.out.println("__STUDENT DATA__");
		setPerson();
		
		System.out.print("Enter the id of the student:");
		id = Person.sc.nextInt();
		System.out.println("Enter the marks of three subjects:");
		m1 = Person.sc.nextInt();
		m2 = Person.sc.nextInt();
		m3 = Person.sc.nextInt();
		System.out.print("Enter the branch name of the student:");
		branch = Person.sc.next();
	}

	void getStudent()
	{
		getPerson();

		System.out.println("ID is:" + id);
		System.out.println("Marks for subject 1 is" + " " + m1 + " for subject 2 is" + " " + m2 + " for subject 3 is" + " " + m3);
		System.out.println("Branch is:" + branch);
	}

	int total()
	{
		return (m1+m2+m3);
	}
}

class Faculty extends Person
{
	float years_of_experience, working_hours;

	void setFaculty()
	{
		System.out.println();
		System.out.println("__FACULTY DATA__");
		setPerson();

		System.out.print("Enter years of experience:");
		years_of_experience = Person.sc.nextFloat();
		System.out.print("Enter the number of working hours:");
		working_hours = Person.sc.nextFloat();
	}

	void getFaculty()
	{
		getPerson();

		System.out.println("The years of experience are:" + years_of_experience);
		System.out.println("The number of working hours are:" + working_hours);
	}

	float cal_sal()
	{
		return(working_hours * 300);
	}
}


 class HierarchyTest
 {
 	public static void main(String ht[])
 	{
 		/*Person p = new Person();
 		p.setPerson();
 		p.getPerson();*/

 		Student s = new Student();
 		s.setStudent();
 		s.getStudent();
 		int t = s.total();
 		System.out.println("Total of three subjects:" + t); 

 		Faculty f = new Faculty();
 		f.setFaculty();
 		f.getFaculty();
 		float ts = f.cal_sal();
 		System.out.println("The total salary is:" + ts);
 	}
 }