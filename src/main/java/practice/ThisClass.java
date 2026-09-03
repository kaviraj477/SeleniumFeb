package practice;

public class ThisClass {
	
	public String method1;  // creating an instance
	public void method2 () {
		this.method1= "king"; // calling the instance and assigning value
		System.out.println(this.method1);
	}
	
	public void method3() {
		int a = 20;
		System.out.println(a);
	}
	
	public static void method4 () {
		System.out.println("fromParent");
	}
	
	public void method5 () {
		System.out.println("Parent");
		this.method3();  // we can also call methods which is not static
		this.method6("arguments");
	}
	
	public void method6 (String s1) {
		System.out.println(s1);
		
	}
	
	public static void main (String [] args) {
		ThisClass obj = new ThisClass();
		
		//obj.method2();
		//obj.method3();
		obj.method5();
	
			
	}
	

}
