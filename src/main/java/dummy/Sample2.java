package dummy;

public class Sample2 {
	
     int a =15;
     static int b = 20;
	
	public void methodone() {
		System.out.println("from public void method");
		
		
	}
	
	public static void main (String [] args) {
		Sample2 obj = new Sample2();
	    System.out.println(obj.a);     //instance variable = objectname.variablename
	   
	    System.out.println(Sample2.b); //static variable = classname.variablename -->Type#1
	    System.out.println(obj.b);     //static varibale = objectname.variablename -->Type#2
	    
	}
	
}
