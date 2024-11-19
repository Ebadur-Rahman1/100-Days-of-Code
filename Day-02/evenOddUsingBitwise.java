
// Write a Java Program to print given number is even or odd using bitwise operator.

import java.util.*;
public class evenOddUsingBitwise {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter an integer number ");
        int a = sc.nextInt();

        // Even numbers always end with a 0 in the last bit (e.g., ...10, ...100, ...1000).
    // Odd numbers always end with a 1 in the last bit (e.g., ...11, ...101, ...1001).

        if((a&1) == 0){
            System.out.print("Even number ");
        }
        else{
            System.out.print("Odd Number ");
        }
        sc.close();
    }
}
