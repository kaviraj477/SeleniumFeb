package projectclass;

public class Dummy4 {
	
	

	public static void main (String [] args) {
		
		String s1 = "name tame ";
		
		int i = s1.indexOf('a');
		char ch = s1.charAt(1);
		String s5 = s1.replace('a', 'b');
		String s4 = s1.substring(2);
		String s = "name tame";
		
		
		
		String[] s2 = s1.split("a");
		
		
		int a = 1;
		char c = '@';
		Integer b = 5;
		
		System.out.println(s2[0]);  //splitting function
		System.out.println(s2[1]);
		
		System.out.println(s2[0]+ "\n"+s2[1]);  //combining the function of line 18 and 19
		
		System.out.println(s1.length());
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(c));
		System.out.println(System.identityHashCode(b));
		System.out.println(s1.trim());
		System.out.println(s1.trim().equals(s));
		System.out.println(i);
		System.out.println(ch);
		System.out.println(s4);
		System.out.println(s5);
	}
	
}
