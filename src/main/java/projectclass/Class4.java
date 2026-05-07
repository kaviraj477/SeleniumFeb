package projectclass;

public class Class4 {
	
  int length;
  int breadth;
  int height;
    
  int volume () {
	  return length+breadth+height;}
	  
  int simplification () {
	  return length + breadth - height;
	  
  }
 public static void main (String [] args) {
//	 Class4 object1;
	 Class4 object1 = new Class4();
	 object1.length = 10;
	 object1.breadth = 5;
	 object1.height = 15;
	 
	 System.out.println(object1.volume());
	 System.out.println(object1.simplification ());
		 
	
		
		
		
	}
}
