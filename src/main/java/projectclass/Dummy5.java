package projectclass;

import java.util.ArrayList;
import java.util.List;

public class Dummy5 {

	public static void main (String [] args) {
		
		List variable = new ArrayList();
		
		variable.add("Name");
		variable.add("string");
		variable.add(12);
		variable.add('@');
		
		variable.toArray();
		
		System.out.println(variable);
		//variable.set(0, 1202);
		//variable.remove(1);
		
       // variable.equals(variable);
		
		//System.out.println(variable.get(0));
		//System.out.println(variable.get(1));
		//System.out.println(variable);	//	
		//System.out.println( variable.get(0).equals(variable.get(1)));
		
	//	for (Object i:variable) {
		//	System.out.println(i);
	//	}
	}
}
