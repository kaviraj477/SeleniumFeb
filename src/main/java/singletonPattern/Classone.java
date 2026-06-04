package singletonPattern;

public class Classone {

	
	public static Classone objectone = null;  //1.static instance variable
	
	private Classone () { }                   // 2. Private constructor
	
	public static Classone methodone () {     // 3. Static method
				
		if(objectone == null){                //4. Conditioning to create object in variable name
			objectone = new Classone();
		}
		 return objectone;	                  // 5. returning method to Classone (reference data type)
	}
	
	public void methodtwo() {
		System.out.println("printing void method from classone");
	}
	
	
	
	public static void main (String [] args) {
		Classone obj1 = methodone();    //storing different methods which contain object as object is returned to classone
		Classone obj2 = methodone();    // i.e storing object into different objects
		
		//TYPE #2
		
		Classone obj3 = Classone.methodone();  //both the methods produce same result
		Classone obj4 = Classone.methodone();
	   
		
		System.out.println("memory space of obj1 : " + System.identityHashCode(obj1));
		System.out.println("memory space of obj2 : " + System.identityHashCode(obj2));
		
		System.out.println("memory space of obj3 : " + System.identityHashCode(obj3));
		System.out.println("memory space of obj4 : " + System.identityHashCode(obj4));
		
		
		//All object contains same memory space as we created a single object and assigned it to different objects without creating new objects. 
		
		
	}
	
	
	
	
	
}
