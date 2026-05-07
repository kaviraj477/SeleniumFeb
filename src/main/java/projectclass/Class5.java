package projectclass;

public class Class5 {

   int	length;
   int breadth;
   int height;
   
   Class5 (int l, int b, int h){ //Parameter constructor method (using same name as class name)
	   length = l;
	   breadth = b;
	   height = h;
   }
   
   Class5 (){ //Empty constructor method (using same name as class name)
	  this(4,5,6);  //calling before constructor method can be done in another constructor only
	   //length = l;
	   //breadth = b;
	   //height = h;
	   
   }
   
  
   
   
    void methodone (int l, int b, int h) { //normal method
    
	   length = l;
	   breadth = b;
	   height = h;
	
	   
	   
   }
   
   int volume () {
	   return length+breadth+height;
   }
	
   public static void main (String [] args) {
	   
	  Class5 object =  new Class5(); // object creation for normal type
	   
	   Class5 consobject = new Class5(1, 2, 3); // invoking for constructor method
	   
	   
	   //object.methodone(5, 70, 10); // invoking for normal method
	   
	   System.out.println("empty constructor " +object.volume());
	   System.out.println("parameter constructo " + consobject.volume());
   }
	
	
	
}
