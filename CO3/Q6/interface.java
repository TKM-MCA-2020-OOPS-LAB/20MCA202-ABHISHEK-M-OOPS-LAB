package opsproj; 
import java.util.*;

interface Calculation{
	public void data_input();
	public void area();
	public void perimeter();
	
}

class circle implements Calculation
{
int r;
double pi=3.14,area,p;

public void data_input() 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the radius of circle");
	r=sc.nextInt();
}
	
		public void area() {
		area=pi*r*r;
		System.out.println("Area of circle:"+area);
		
	}
		public void perimeter() {
			p=2*pi*r;
		System.out.println("Perimeter of circle:"+p);
		
		
	}
}
class Rectangle implements Calculation{
	 int area,p,t,b,l;

	public void data_input()
	{
	Scanner sc1=new Scanner(System.in);
	System.out.println("Enter the length of rectangle");
	l=sc1.nextInt();
	System.out.println("Enter the breadth of rectangle");
	b=sc1.nextInt();
	}

	@Override
	public void area()
	{
		area=l*b;
		System.out.println("area of the rectangle is:"+area);
	}

	public void perimeter() 
	{
		p=2*(l+b);
		System.out.println("area of the rectangle is:"+p);
		
	}
	}

public class Interface {
	public static void main(String[] args) {
		
		int c=0;
		circle a=new circle();
		Rectangle b=new Rectangle();
		
		while(c<3) 
		{
		Scanner sc2=new Scanner(System.in);
		System.out.println("....Enter the choice...\n1.Circle:\n2.Rectangle: ");
		c=sc2.nextInt();
		switch(c) 
		{
		case 1:
			a.data_input();
			a.area();
			a.perimeter();
			break;
		case 2:
			b.data_input();
			b.area();
			b.perimeter();
			break;
		 default:
			 System.out.println("INVALID CHOICE!");
		}
	 }
	
	}


}
