package singletonPattern;

public class SingletonClass {
	
	public static SingletonClass var = null; // 1.incomplete object setting to null (initializing but setting it to null without creating object)
	 
	private SingletonClass () {}   // 2.Private constructor (restricts calling or creating object in the name of SingletonClass.)
	
	public static SingletonClass methodone() { // classname is the datatype for object, since we are returning an object we use classname instead of other datatypes  
		if (var == null) {                 // 3.completing obect creation by setting it to null bcz to avoid null pointer exception
			var = new SingletonClass ();
		}
		return var;
	}
    
	public void methodtwo () {
		System.out.println("method two value is : java - selenium");
	}
	
	public void methodthree () {
		int a = 20;
		int b = 30;
		int c = a+b;
		System.out.println("methodthree addition value is :"+c);
	}
	
	public String methodfour () {
		String a = "Project class";
		System.out.println("methofour string value is :"+a);
		return a;
	}
	
	public static void main (String [] args) {
		
		SingletonClass obj = methodone();
			
	}
}
