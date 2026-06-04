package abstractclass;

public class ClassFive implements InterfaceOne, InterfaceTwo {



	@Override
	public void methodFour() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodIntOne() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodIntTwo() {
		// TODO Auto-generated method stub
		
	}


	
	public static void main (String [] args) {
		
		System.out.println(InterfaceOne.a); //we cannot call using object created in main method , only we can print
	//	System.out.println(InterfaceTwo.b);
	
}

}