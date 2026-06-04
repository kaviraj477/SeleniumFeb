package projectclass;

import java.util.Arrays;

public class Dummy3 {
	
	
	
	public static void main (String [] args) {
 
		//Declaring with pre defined size 
		//+memory wastage
		
		int a[] = new int[3];   //TYPE #1 Array method
		a[0]=10;
		a[1]=20;
		a[1]=10;
		
		int [] b = {1,7,5,8};    //TYPE #2 Array method
		
		int l = a.length; //to know the length
		
		for (int i =0; i<3; i++) {           //For loop method
			System.out.println(a[i]);
		}
		
		for (int j:a) {
			System.out.println(j);           //For each method : Both are same
		}
		
		
		System.out.println(Arrays.toString(a));   
		System.out.println(Arrays.toString(b));
		
		//System.out.println(a[1]);
		//System.out.println(a[3]);  //Exception error-  out of bound index

		//Declaring without defining size
		//+no memory wastage
			//int[] b = {10,20,50};
		//System.out.println(b[1]);
		
		//String concept: IMMUTABLE 
		
		String s1 = "automation";
		String s2 = "testing";
		
		String s3 = s1.concat(s2);
		
		System.out.println(s3);		
		
 //string buffer concept: MUTABLE
		
		StringBuffer sb = new StringBuffer("automation");
		sb.append("testing");
		
		System.out.println(sb); 
		
		
	}
}