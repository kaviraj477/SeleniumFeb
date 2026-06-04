package projectclass;

public class Class8 {
	
	static Class8 obj = new Class8();
	static Class8 obje = null;
	static Class8 object = null;
	
	public static void methodone() {
		System.out.println("methodone");
	}
	
	public static void methodtwo() {
		System.out.println("methodtwo");
	}
	
    public static void main (String  [] args) {
    	
    	object = new Class8();
    	
    	methodone();
    
    	methodtwo();
    	
    }
}
