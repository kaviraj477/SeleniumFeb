package practice;

public class LoopPractice {
	
	public static void main (String [] args) {
		
		
		for (int i =3; i<5; i++) { // here the values and conditions are given at the same time so anyhow it starts the loop
			
			if (i==3) {
				continue;
			}
			System.out.println("for loop value" +i);	
		
				}
		//-------------------------------------------------------------------------------------------------------------------------------
		
		int i=0;      // while is also clalled as entry level checking
		while (i<5) { // unlike for loop here the loop begins only if the condition is true or feasible
			System.out.println("while loop value" +i);
			i++;
		}
		
		//-------------------------------------------------------------------------------------------------------------------------------
		
		int a = 1; // also called as exit level checking
		do {   // do loopo must be followed by while were the conditions are set, do performs actions whose condition is based on while
			System.out.println("do while loop value" + i);
			i++;
		}
		while (i<4);
		
	//------------------------------------------------------------------------------------------------------------------------------------	
	}

}
