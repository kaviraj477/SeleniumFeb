package arrayNcollections;

public class Array {
	
	public static void main (String [] args) {
		
		//SYNTAX:
		//1.datatype [ ] variable = {a,b,c,...};
		//2. datatype [] variable = new int [5]; (5--> denotes the size)
		// [] --> symbol defining array method.
		//Collections of similar datatype (both primitive and non primitive) also classes
		
		             
		
		int [] marks = {20,10,30};
		System.out.println(marks);  //prints only the memory location hashcode
		
		                         //1.METHOD ONE

		for (int i=0;i<3;i++ ) {
			System.out.println(marks[i]);
		}
		
                               //2.METHOD TWO:
		for (int i=0; i<marks.length;i++) {
			System.out.println(marks[i]);
		}
		
		                        //3.METHOD THREE:
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		
		
		
	}
}