package projectclass;

public class Class6 {
	
	
	private Class6(){	}        //1.private constructor
	
	public static Class6 varObj = null;   //2.static variable creation with classname as datatye
	
	public static Class6 methodone () {  //3.creation of static method with classname as datatype
		if (varObj == null) {
		varObj = new Class6();  }            //object creation
		return varObj;
		
	}
	
	public static void main (String [] args) {
		Class6 object = Class6.methodone();
		System.out.println(object.hashCode());
		
		Class6 object2 = Class6.methodone();
		System.out.println(object2.hashCode());
	}
	
	
	
	

}
