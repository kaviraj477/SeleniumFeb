package practice;

public class SuperClass extends ThisClass {
	
	public void method5() {
		System.out.println("Child");
	}
	
	public void methodparent () {  // creating a method to call parent methods in child classs
		super.method5();  // super.parentmethodname(); --> this calls the parent method5 not child method5
	}

    
	public static void main (String [] args) {
		
		//-----------------WAYS TO CALL PARENT METHODS IN CHILD CLASS---------------------------------------//
		
      //--# METHOD 1: USING CHILD CLASS OBJECT
		
		SuperClass obj = new SuperClass(); //CREATING AN OBJECT IN CHILD CLASS NAME AS USUAL
		obj.methodparent();               // BUT WE ARE CALLING A METHOD IN CHILD CLASS WHERE WE CALLED PARENT METHOD USING "super.parentmethodname();"
		 
		//--# METHOD 2: USING PARENT CLASS OBJECT
		
		ThisClass obj1 = new ThisClass(); // WE SHOULD CREATE AN OBJECT IN THE NAME OF PARENT CLASS 

    	obj1.method5();        //AND WE SHOULD CALL THE PARENT METHOD'S NAME USING THE PARENT CLASS OBJECT   
//		
		// CALLING CHILD CLASS METHOD:
    	
    	obj.method5();  // WE MUST CALL THE CHILD CLASS METHOD IN THE NAME OF THE CHILD CLASS OBJECT ONLY
	}
    

}
