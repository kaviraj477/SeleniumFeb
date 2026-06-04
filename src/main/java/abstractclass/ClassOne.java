package abstractclass;

public abstract class ClassOne { //an abstract by itself can contain an abstract method (must ) and an non abstract method but only the abstract method is overrided.
	
	abstract void methodone ();  // this is the abstract method and this is overrided in another class
	//refer instruction in DummyAbs class <--- projectclass (package0
	
	public static void methodtwo () {  //this is not a abstract method this stays in this page and this is not overrided in another classes
	//we can also create object for this method only if the method is declared as static
    //if the method is declared a non static or other type we cannot create an oject as this is an abstract class
		System.out.println("from parent abstract class");
	}
	
public static void main (String [] args) {
	methodtwo();
	
}
}
