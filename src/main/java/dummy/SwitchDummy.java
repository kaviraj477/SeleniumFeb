package dummy;

import java.util.Scanner;

public class SwitchDummy {
    public static void main(String[] args) {
        int i ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a");
        int a = sc.nextInt();

        System.out.println("enter the value of b");
        int b = sc.nextInt();

        System.out.println("Enter the operator");
        String s = sc.next();
        
      

        switch (s) {
            case "+":
                i = a + b;

            case "-":
                i = a - b;

            case "*":
                i = a * b;
                
            case "%" :
            	i = a%b;
            	
            case "/" :
            	i = a / b ;
                
                System.out.println("the solved value is "+i);
        }
      

    }
}