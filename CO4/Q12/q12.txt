package co4;

import java.util.*;
public class stack {
	public static void main(String args[])
	{
		// Creating an empty Stack
		Stack<String> stack = new Stack<String>();

		// Use add() method to add elements in the Stack
		stack.add("jack");
		stack.add("harry");
		stack.add("kane");
		stack.add("kante");
		stack.add("Depaul");

		// Output the Stack
		System.out.println("Stack: " + stack);

		// Remove the element using remove()
		String rem = stack.remove(1);

		// Print the removed element
		System.out.println("Removed element: "+ rem);

		// Print the final Stack
		System.out.println("Final Stack: "+ stack);
	}
}