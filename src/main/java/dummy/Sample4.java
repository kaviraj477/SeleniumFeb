package dummy;

public class Sample4{
	
	public void methodone() {
		System.out.println("methodone");
	}
	
	public void methodtwo() {
		System.out.println("methodtwo");
	}
	
	public void methodthree() {
		System.out.println("methodthree");
	}
	
	public static void main (String [] args) {
		
		Sample4 obj = new Sample4();
		obj.methodone();
		obj.methodtwo();
		
		System.out.println(System.identityHashCode(obj));
		
		Sample4 obj2 = new Sample4();
		obj2.methodone();
		obj2.methodtwo();
		
		System.out.println(System.identityHashCode(obj2));
		
	}
	
	
	
}
