import java.util.Scanner;
class Employee
{
    int id;
    String name;
    int basic_salary;
      float gross_sal()
        {
          float da,ta,hra,gross;
          da=0.65f * basic_salary;
          ta=0.10f * basic_salary;
          hra=0.35f * basic_salary;
          gross=basic_salary+da+ta+hra;
          return gross;
        } 
     void setEmployee()
  {
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter the ID of the Employee:");
      id=sc.nextInt();
    System.out.println("Enter the Name of the Employee:");
      name=sc.next();
    System.out.println("Enter the Basic Salary of the Employee:");
      basic_salary=sc.nextInt();
  }
     void getEmployee()
  {
      System.out.println("ID = " + id);
      System.out.println("Name is " +name);
      System.out.println("Basic Salary = " + basic_salary);
  }
}
     class EmployeeDemo
{
       public static void main(String args[])
  {
     Employee e1=new Employee();
     e1.setEmployee();
     e1.getEmployee();
    float gross=e1.gross_sal();
     System.out.println("Gross Salary = " + gross);
  }
}