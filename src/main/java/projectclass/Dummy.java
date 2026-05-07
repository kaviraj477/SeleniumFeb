package projectclass;

public class Dummy {
	
	private Dummy() {}
	
	public static Dummy variable = null;
	
	public static Dummy methodology () {
		
		if (variable == null) {
			variable = new Dummy() ;
		}
		return variable;
	}
	public void methodology2 () {
		
		System.out.println("singleton");
		
		
	}
	
	public void methodology3 () {
		System.out.println("java selenium");
		this.methodology2();
	}
	
	public static void main (String [] args) {
		Dummy object1 = Dummy.methodology();
		
		Dummy object3 = new Dummy();  //equating object3 values with Dummy
	//	object3.methodology2();        // appending methodology2 and methodology3 values with object3 which is equated with Dummy
		object3.methodology3();
		
	}
	
	

	
		
}