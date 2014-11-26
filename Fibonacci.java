/**/

import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        int userChoice = 0;
        int[] fibonacciArray;

        Scanner keyboard = new Scanner(System.in);
        while (userChoice < 2 || userChoice > 25) {
            System.out.print("Enter  number of Fibonacci numbers to generate [2-25]: ");
            try {
                userChoice = keyboard.nextInt();
            } catch (Exception e) {
                keyboard.nextLine();
            }
        }

        fibonacciArray = new int[userChoice];
        fibonacciArray[0] = 1;
        fibonacciArray[1] = 1;

        System.out.println("Generating numbers...");
        for (int fibSet = 2; fibSet < fibonacciArray.length; fibSet++) {
            int newNum = (fibonacciArray[fibSet - 2] + fibonacciArray[fibSet - 1]);
            fibonacciArray[fibSet] = newNum;
        }
        System.out.println("Done!");
        System.out.println();
        System.out.println();
        System.out.println("Numbers generated:");
        
        for (int printFib : fibonacciArray) {
            System.out.print("[" + printFib + "]");
        }
    }
}
