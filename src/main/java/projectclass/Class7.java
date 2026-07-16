package projectclass;

public class Class7 {
	
	int obj  = Class1.Class1returnmethod();
	
	public void methodone() {
		int a = 20;
		int b = 30;
		int c = a+b;
		System.out.println("the methodone value is: "+c);
		
		
	}
	public void methodtwo() {
		 Class1.Class1method();
		System.out.println("printing methodtwo");
	}

	public static void main (String [] args) {
		Class7 object = new Class7();
		
		object.methodone();
		object.methodtwo();
		
		Class1 objvar = new Class1();
		objvar.Class1method();
		objvar.Class1returnmethod();
		
		
	//	int obj  = Class1.Class1returnmethod();
	  //  Class1.Class1method();
		
	
		
		
	}
	
}
