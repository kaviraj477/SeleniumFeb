package projectclass;

public abstract class DummyAbs {  //1.public abstract - this class can be used in different packages
	                              //2.abstract - cannot be used in different packages
	
	abstract void methodabsone();  //an abstrac method must have abstract class
	  //1.abstract method is mentioned without a body 
	 //2. the inheriting classes are must required to write the same method and to create a body for it
	//3.abstract method cannot be static
	//4.we cannot create object for abstract class as we have method without body
	
	
 
   public static void methodtwo() {
	   System.out.println("from normal method");
   
	   
   }
	
	


class DummyAbs2 extends DummyAbs{   //1.this class should not be named as public (but you can name as public if you create a seperate class in a new page)
	                                //2.this is a inheriting class so it must implement or create the same method of abstract class
	void methodabsone() {           //3.also it must create a body for it 
		System.out.println("abc");
	
	
	
	
	}}}
	
	

