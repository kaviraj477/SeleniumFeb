package abstractclass;

public class ClassThree extends ClassOne {

	@Override
	void methodone() {
		// TODO Auto-generated method stub
		System.out.println("abc");
	}
	
	public static void main (String [] args) {
		ClassThree object = new ClassThree();
		object.methodone();
	}

}
