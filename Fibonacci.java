/**/

import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
    	int userChoice = 0;
    	int[] fibonacciArray;
    	
    	Scanner keyboard = new Scanner(System.in);
    	
    	System.out.print("Enter  number of Fibonacci numbers to generate [> 0]: ");
    	
    	while(userChoice == 0) {
	    	try {
	    		userChoice = keyboard.nextInt();
	    	} catch(Exception e) {
	    		System.out.print("Enter a value > 0: ");
	    		keyboard.nextLine();
	    	}
    	}
    }
}
