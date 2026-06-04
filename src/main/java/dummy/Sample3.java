package dummy;

public class Sample3  {
	
    public static Sample3 object = null ; // creating instance variable and initializing it
	Sample3 object2 = new Sample3 (); // creating an object so that it can be returned in method created using class name.
                                      // this method causes stack over flow problem
	
	//both can be called as instance variable and both can be returned in classnamed methods
	
	public void method() {
		System.out.println("printing");
		
	}
	
	public Sample3 methodtwo() { //creating an method with class as datatype requires to return an object previously created.
		
		return object;
	
		
	}
	
	public static void main (String []  args) {
		Sample3 obj = new Sample3();
		obj.method();
		object = new Sample3(); // since the variable is already created we can call by this method
	                            // static keyword is must in variable to call this main method
	}

}
