package projectclass;

public class Class2 {
	
public void methodOne() { //camal notation
		
		//Datatype variable = value
		int var = 100;
		System.out.println("Printing the valueof a : " +var);
		int a = 10;
		int b = 5;
		String s = "Name";
		System.out.println(a+b);
		
		System.out.println("Welcome to Session1");          //short key - sysout --> cntrl+space
		

	}
	
	public void methodTwo() {
		System.out.println("My name is Vikash");
	}
	
	
	public static void main(String[] args) {              //short key - main --> cntrl+space
		
		System.out.println("Written text in main method");      // to comment code --> cntrl + /
		
		Class2 objectName = new Class2();  //camal notation                //object creation
		objectName.methodOne();
		objectName.methodTwo();
		
		
	}
	

}
