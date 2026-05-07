package singletonPattern;

public class Classone {

	
	public static Classone objectone = null;
	
	private Classone () { }
	
	public static Classone methodone () {
		
		if(objectone == null){
			objectone = new Classone();
		}
		 return objectone;	
	}
	
	public static void methodtwo () {
		System.out.println("Singleton");
	}
	
	public static void methodthree () {
		System.out.println("links");
	}
	
	public static void main (String [] args) {
		Classone C1 = methodone();
		
		C1.methodtwo();
		C1.methodthree();
	}
	
	
	
	
	
}
