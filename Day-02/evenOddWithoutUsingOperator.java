// Write a Java Program to print given number is even or odd without using modulous or bitwise operator.

import java.util.*;
public class evenOddWithoutUsingOperator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter an integer number: ");
        int number = sc.nextInt();
        if((number/2)*2==number){
            System.out.print("Given number is Even ");
        }
        else{
            System.out.print("Given Number is Odd ");
        }
        sc.close();
    }
}
