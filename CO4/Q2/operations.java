package arithmetic;
interface op
{
	void addition(double a,double b);
	void subtraction(double a,double b);
	void multiplication(double a,double b);
	void division(double a,double b);
	
}

public class operations implements op {
public void addition(double a,double b) {
	

System.out.println("sum of numbers is"+(a+b));
}
public void subtraction(double a,double b) {
	System.out.println("difference of numbers is:"+(a-b));
	
}
public void multiplication(double a,double b)
{
	System.out.println("product of numbers is:"+(a*b));
	
}
public void division(double a,double b) {
	System.out.println("  division of numbers is:"+(a/b));
	
}

	
}




