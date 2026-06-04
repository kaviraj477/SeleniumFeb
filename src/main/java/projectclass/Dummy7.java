package projectclass;

public class Dummy7 {
	
	//1.Static method
	public static void staticmethod() {    
		System.out.println("sdjfnjdsnf");
	}
	 
	//2.static return type
	public static int staticreturnmethod() {
		int a = 20;
		int b = 10;
		int c = a+b;
		return c;
	}
	
	//3.Constructor type
	public Dummy7() {
		System.out.println("constructor method");
	}
	
	//4.Non static method
	public void nonstaticmethod() {
		System.out.println("non static method");
	}
	
	//5.Non static return type
	public String nonstaticreturnmethod() {
		String a = "Non - Static return type";
		return a;
	}
	//6.Arguments passed
	public static void argumentsmethod(int a , String b) {
		System.out.println("the integer and string value is "+ a+ b); //method to print two or more values
		
	}
	
	//7.Arguments passed return datatype
	public static int argumentsreturnmethod(int b, int c) {
		int sum = b+c;
		System.out.println("the arguments passed return type method value is "+ sum); //printing return type
		return sum; //last line must be the return variable.
		
	}
	 
	//8.Arguments passed non static method
	public void argumentsnonstaticmethod(int e, String s2) {
		System.out.println("argumentsnonstaticmethod value is "+ e + s2);
		
	}
	
	//9.Arguments passed non static return method
	public int argumentspassednonstaticreturnmethod(int i1, int i2) {
		int i3 = i1 + i2;
		System.out.println("arguments passed non static return method value is " + i3);
		return i3;
	}
	
	//10.Static Instace method
	
	static int var1 = 15;
	static int var2 = 10;
	static int var3 = var1 + var2;
	
	//11.Non static instance method
	
	String s3 = "Non static instance method";
	
	

	
	
	
	
	public static void main (String [] args) {
		staticmethod();   //method for calling static method
		staticreturnmethod(); //method for calling static retun type method
		System.out.println(staticreturnmethod());  //method for printing static return type
		// -------------------------------------------------------------------------------------
		Dummy7 object1 = new Dummy7(); //method for calling constructor method (as usual like non- static method)
		System.out.println(object1);   //method for printing constructor (as usual)
		
		//---------------------------------------------------------------------------------------
		Dummy7 object2 = new Dummy7();
		object2.nonstaticmethod();   //method for calling non static method
		//----------------------------------------------------------------------------------------
		object2.nonstaticreturnmethod(); //method for calling non static return type
		System.out.println(object2.nonstaticreturnmethod());  //printing for non static return type
		
		//--------------------------------------------------------------------------------------
		argumentsmethod(20,"Name"); //method for calling arguments method (no need to add any print statement)
		
		//----------------------------------------------------------------------------------------
		
		argumentsreturnmethod(10,5);
		//----------------------------------------------------------------------------------------
		object2.argumentsnonstaticmethod(10, "String value");
		
		//----------------------------------------------------------------------------------------
		object2.argumentspassednonstaticreturnmethod(10, 30);
		
		//----------------------------------------------------------------------------------------
		int instancevariable = var3;
		System.out.println("instance variable method "+ instancevariable);  //method #1
		System.out.println(var3);  //method#2
        
		//----------------------------------------------------------------------------------------
		System.out.println(object2.s3);  //method to call a non static instatnce variable
	}
}
