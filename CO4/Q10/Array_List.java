package test;
import java.util.*;
public class Array_List {

	public static void main(String[] args) {

		ArrayList<String> obj= new ArrayList<String>();
		obj.add("Football");
		obj.add("Cricket");
		obj.add("Golf");
		obj.add("Boxing");
		System.out.println("\n Arraylist is:\n");
		for(String list:obj)
			System.out.println(list);
		System.out.println("\nList After Removing elements:\n");
		obj.remove("Boxing");
		for(String list:obj)
			System.out.println(list);
		System.out.println("\n List After Sort:\n");
		Collections.sort(obj);
		for(String list:obj)
			System.out.println(list);
		System.out.println("\nString at Index 0 is: "+obj.get(0));
		System.out.println("String at Index 1 is: "+obj.get(1));
		
		System.out.println("\nTennis is present in List:"+obj.contains("Tennis"));
		System.out.println("Football is present in List:"+obj.contains("Football"));
		
		System.out.println("\nSize of the list:"+obj.size());
		
	    obj.clear();
	      
	    System.out.println("\nArrayList after clear method :"+obj);
		
	}

}
