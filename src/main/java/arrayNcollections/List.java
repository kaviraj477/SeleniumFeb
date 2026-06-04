package arrayNcollections;

import java.util.ArrayList;

public class List {
	
	public static void main (String [] args) {
		
	
		/* SYNTAX
		 * ArrayList var = new ArrayList();
		 * ArrayList <Datatype> var = new ArrayList <> ();
		 */
		
		ArrayList al = new ArrayList();
		al.add(20);
		al.add('@');
		
		ArrayList bl = new ArrayList();
		bl.add("String");
		bl.add(true);
		
		bl.addAll(al);
		
		System.out.println(al);   //no need of for loop unlike Array
		System.out.println(bl);
		
		ArrayList <Integer> var = new ArrayList <> ();
		var.add(20);
		var.add(45);
		
		System.out.println(var);
		
		
		
		
	}

}
