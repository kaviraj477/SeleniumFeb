package projectclass;

public class Class1 {
	
	public static void Class1method() {
		System.out.println("calling the method from class1 in package --projectclass");
	}
	
	public static int Class1returnmethod() {
		int a = 20;
		System.out.println("Class1 return method value" + a);
		return a;
	}

	
	public static void main (String [ ] args) {
		
		Class1 objClass1 = new Class1(); 
		
	 System.out.println("number 1");
	 Class2();
	 System.out.println("message  3");
	 System.out.println(Class3());
	 System.out.println(Class4(20, 10)) ;
		
	}
	public static void Class2() {
	System.out.println("message 2 ");
	System.out.println("message 4");
	
}
	public static int Class3 () {
		int a = 10;
		int b = 15;
		int c = a+b;
		return c;
	}		
	public static int Class4(int c, int d) {
		return c-d;
	
	
	
	}
}