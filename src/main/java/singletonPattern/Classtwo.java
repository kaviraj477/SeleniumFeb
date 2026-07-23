package singletonPattern;

public class Classtwo {

  public static Classone obj = Classone.methodone();
 
 public static void methodfive() {
	 obj.methodtwo();
 }
 
 
 
 
 public static void main (String [] args) {
	 Classone o1 = Classone.methodone();  // variable o1 calls by going ot classone and into methodone
	 Classone o2 = Classtwo.obj;          // variable o2 goes ot classone and into obj
	 
	 //methodfive();
	 System.out.println(System.identityHashCode(o1)); 
	 System.out.println(System.identityHashCode(o2));
	 
	 
 }
	
 }	
