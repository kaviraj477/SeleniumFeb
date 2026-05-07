package singletonPattern;

public class Classtwo {

	public static Classone C2 = Classone.methodone();
	
	public static void main (String [] args) {
		
		C2.methodtwo();
		C2.methodthree();
	}
	
	
	
	
	
}
