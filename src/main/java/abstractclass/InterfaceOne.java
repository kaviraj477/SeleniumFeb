package abstractclass;

public interface InterfaceOne { //we cannot create objects for interface as like abstract class
	
	 void methodIntOne();  //all the methods are created as like abstract method
	 int a = 10; //the value is static and fina (cannot be over written)
	 
	 void methodIntTwo();
	
public interface InterfaceTwo{
	void methodIntThree();
	
	 
class classOne implements InterfaceOne, InterfaceTwo{ //In order to inherit two or more classes we use concept called interface and we
                                                      //we should inherit interfaces in class only , so we create a class to inherit
	@Override 
	public void methodIntThree() {
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
	 
	 
	 
	
}
}
}