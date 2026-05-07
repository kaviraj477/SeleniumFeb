package projectclass;

public class Class3 {                          // two types of variable = 1.intsance & 2.Static
	                                           //instance variable
	String instance1 = "a";                    // static String instance2 = "b" ---then it becomes static variable
	String instance2 = "b";
	String instance3 = instance1 + instance2;
	static String instance4 = "c";             // Static variable
	static Class3 svobject = null;
	
	static int methodone (int a, int b, int c) { //no need to create object for static methods
	                                             // parameter values require return type	
		return a+b-c;
	}
	
	 static void methodtwo() {
		
		 System.out.println("methodtwo");
	}
	
	int methodthree() {
		int a = 5;
		int b = 6;
		int c = a-b;
		return c;
	}
	static int methodfour(int x, int y) {
		 int z = x+y;
		 System.out.println(z);
		 return z;
	 }
	
	
	public static void main (String [] args) { //we can call methods without creating object because of static

		Class3 objectinstance = new Class3();
		System.out.println(objectinstance.instance3);  //calling instance varaiable value (objectname.variablename)
		 
		System.out.println(Class3.instance4);          // calling static variable (classname.variablename)
		
		System.out.println(methodone(4,5,6)); //calling method for static + return
		methodtwo(); //calling method for static +void (non return type)
		
	    Class3 object =  new Class3(); //calling method for non static type
		System.out.println(object.methodthree());
		System.out.println(object.instance1);  //calling instance values using other objects
		System.out.println(object.instance3);
		
		methodfour(12,15); //calling method for return type
		//System.out.println(z1);
		
	}
	//if sysout is mentioned in method no need seperate sysout in main method , but non mention we call method inside sysout
	
	
	
	
	
	

}