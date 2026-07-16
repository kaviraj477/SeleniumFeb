package projectclass;

public class ConstructorDemo extends DummyAbs {

	@Override
	void methodabsone() {
		// TODO Auto-generated method stub
		System.out.println("from astract");
		
		
	}

	public static void main (String [] args) {
		ConstructorDemo obj = new ConstructorDemo ();
		obj.methodabsone();
		obj.methodtwo();
	}
	
	

}
