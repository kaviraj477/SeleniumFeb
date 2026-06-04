package singletonPattern;

public class Reference {
	
	
		
	    public static Reference object = null ; // creating instance variable and initializing it
		Reference object2 = new Reference (); // creating an object so that it can be returned in method created using class name.
	                                      // this method causes stack over flow problem
		
		//both can be called as instance variable and both can be returned in classnamed methods
		
		public void method() {
			System.out.println("printing");
			
		}
		
		public Reference methodtwo() { //creating an method with class as datatype requires to return an object previously created.
			
			return object;
		
			
		}
		
		public static void main (String []  args) {
			Reference obj = new Reference();
			obj.method();
			object = new Reference(); // since the variable is already created we can call by this method
		                            // static keyword is must in variable to call this main method
		}

	}



