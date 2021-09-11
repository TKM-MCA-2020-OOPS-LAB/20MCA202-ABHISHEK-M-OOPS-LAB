package opsproj;
import java.util.*;
class Student{
	String sn;
	String Dept;
	int rollno,sem,phy,chem,maths;
	public Student() {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the name of the student");
		sn=s1.nextLine();
		System.out.println("Enter the dept");
		Dept = s1.nextLine();
		System.out.println("Enter the Rollno");
		rollno = s1.nextInt();
		System.out.println("Enter the semester number");
		sem = s1.nextInt();
			System.out.println("Enter the Mark of pysics");
			phy = s1.nextInt();
			System.out.println("Enter the Mark of chemistry");
			chem = s1.nextInt();
			System.out.println("Enter the Mark of maths");
			maths = s1.nextInt();
		
		
	}
	
}

class Sports extends Student{
	int pos;
	String cat;
	int shots,goals,ch,assist,ac,pen,fk;
	public Sports() {
		Scanner sp = new Scanner(System.in);
		System.out.println("enter the sport:");
		cat = sp.nextLine();
		System.out.println("Enter the total no of Goals you scored");
		goals = sp.nextInt();
		System.out.println("penalties scored");
		pen = sp.nextInt();
		System.out.println("freekicks scored");
		fk = sp.nextInt();
		System.out.println("shots on target");
		shots = sp.nextInt();
		System.out.println("Chances created");
		ch = sp.nextInt();
		System.out.println("No of assist");
		assist = sp.nextInt();
		System.out.println("passing accuracy");
		ac = sp.nextInt();
		
		
	}
}
	


class Result extends Sports {
		 public Result() {
		 }
		 void display()
		   { 
			      System.out.println(" .......STUDENT DETAILS........");
			      System.out.println("name:"+sn);
				  System.out.println("department:"+Dept);
				  System.out.println("rollno:"+rollno);
				  System.out.println("department:"+Dept);
				  System.out.println("sem:"+sem);
				  System.out.println("......Academic Details.....");
				  System.out.println(" Marks of physics:"+phy);
				  System.out.println(" Marks of Chemistry:"+chem);
				  System.out.println(" Marks of Maths:"+maths);
				  System.out.println(" .....SPORTS DETAILS......:");
				  System.out.println(" sport:"+cat);
				  System.out.println(" No of Goals scored:"+goals);
				  System.out.println(" penalities scored:"+pen);
				  System.out.println(" Freekicks scored:"+fk);
				  System.out.println(" shots on target:"+shots);
				  System.out.println(" Chances created:"+ch);
				  System.out.println(" Passing Accuracy"+ac);
								   } 
	}
public class AStudent{
	public static void main(String[] args) {
		Result obj = new Result();
		obj.display();
	}
	
}


