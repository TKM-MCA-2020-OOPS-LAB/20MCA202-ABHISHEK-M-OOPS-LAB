package opsproj;
import arithmetic.operations;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		double q1,q2;
		int ch = 0;
		operations obj = new operations();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the two numbers:");
		q1 = sc.nextDouble();
		q2 = sc.nextDouble();
		while(ch<5) {
		System.out.println("\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\nEnter the choice:");
		ch= sc.nextInt();
		switch(ch)
		{
		case 1:
			obj.addition(q1,q2);
		break;
		case 2:
			obj.subtraction(q1,q2);
		break;
	    case 3:
	    	obj.multiplication(q1,q2);
	    	break;
	    case 4:
	    	obj.division(q1,q2);
	    	break;
	    	
	    default:
	    	System.out.println("Invalid choice");
	    	
	}
		}
}
}