package opsproj;

import java.util.*;

class Person
{
	String name,gender,address;
	int age;
	
	public Person()
	{
		Scanner e = new Scanner(System.in);
		System.out.println("Enter Name : ");
		name = e.next();
		System.out.println("Enter Age : ");
		age = e.nextInt();
		System.out.println("Enter Gender : ");
		gender = e.next();
		System.out.println("Enter Address : ");
		address = e.next();
		
		
	}
}

class Employee3 extends Person
{
	int empid,salary;
	String qualification,cn;
	
	public Employee3()
	{
		Scanner e2 = new Scanner(System.in);
		System.out.println("Enter Emp_id : ");
		empid = e2.nextInt();
		System.out.println("Enter Salary : ");
		salary = e2.nextInt();
		System.out.println("Enter Qualification : ");
		qualification = e2.next();
		System.out.println("Enter Company Name : ");
		cn = e2.next();
		
	}
}

class Teacher extends Employee3
{
	String sub,dept;
	int tid;
	
	public Teacher()
	{
		Scanner t1 = new Scanner(System.in);
		System.out.println("Enter Teacher_id : ");
		tid = t1.nextInt();
		System.out.println("Enter Subject: ");
		sub = t1.next();
		System.out.println("Enter Department : ");
		dept = t1.next();
		
	}
	
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Gender : "+gender);
		System.out.println("Address : "+address);
		System.out.println("Emp id : "+empid);
		System.out.println("salary : "+salary);
		System.out.println("Qualification : "+qualification);
		System.out.println("Company Name : "+cn);
		System.out.println("Teacher id : "+tid);
		System.out.println("Subject : "+sub);
		System.out.println("Department : "+dept);
		
		
	}
}

public class multilevel{

	public static void main(String args[])
	{
		int no;
		
		Scanner n = new Scanner(System.in);
		System.out.println("Enter no of teachers : ");
		no = n.nextInt();
		
		Teacher[] obj = new Teacher[no];
		
		for(int i=0;i<no;i++)
		{
			obj[i] = new Teacher();
		}
		
		 for(int i=0;i<no;i++)
		    {
		    	System.out.println("\nDetails of Employee  No : " + (i+1));
		    	obj[i].display();
		    }
		
		
	}
}