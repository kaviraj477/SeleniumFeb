package singletonPattern;

public class SingletonClass2 {
	
	public static void main (String [] args) {
	
	SingletonClass var =  SingletonClass.methodone (); // this syntax calls the object from methodone and stores it in var(classtwo object var)
                                                       // we do this instead of creating a new object, we use the same obj space to save memory.
	
    var.methodtwo();
    var.methodthree();
    var.methodfour();
}
}