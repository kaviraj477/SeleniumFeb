package projectclass;

import java.util.Scanner;

class Dummy6{
	
	public static void main (String [] args) {
		
		System.out.println("enter the values");
		Scanner sc = new Scanner (System.in);
		
		try {
			int age = sc.nextInt();
			if (age <1) {    //enter value less than 1 and check the execution of the program
				throw new Exception ("Age should be greater than 1");
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
}
