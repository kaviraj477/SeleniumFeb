package projectclass;

public class InheritanceDemo extends Class4 {

	@Override
	int volume() {
		// TODO Auto-generated method stub
		return super.volume();
	}

	@Override
	int simplification() {
		// TODO Auto-generated method stub
		return super.simplification();
	}

	public static void main (String [] args) {
		InheritanceDemo object = new InheritanceDemo();   // 1.TYPE#1 :accessed using extends keyword
		object.length =10;                                // This is aka "(Is-A)" type inheritance
		object.length = 20;
		object.height = 5;
		//object.volume();
		//object.simplification();
		System.out.println(object.volume());
		System.out.println(object.simplification());
		
//----------------------------------------------------------------------------	
		//2.TYPE #2 :accessing using object creation
		// This is aka "(Has-A)" type inheritance (OR) "COMPOSITION"
		
		Class7 object1 = new Class7();  //object variable name must be different from original object name
		object1.methodone();
		object1.methodtwo();
		
	}
	

}
