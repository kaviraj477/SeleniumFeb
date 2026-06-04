package abstractclass;

public class ClassTwo extends ClassOne {

	@Override
	void methodone() {     //1.must implement the abstract method since we inherited the class
		// TODO Auto-generated method stub
		System.out.println("xyz");
	}
	
	public static void methodtwo () {  //2.we can also create a non abstract method and call
		System.out.println("non abstract method");
	}
	
	public static void main (String [] args) {
		ClassTwo object1 = new ClassTwo();  //creating object for abstract method to call like non static method
		object1.methodone();
		
		methodtwo();  //calling non abstract method
	}
	
	

}
