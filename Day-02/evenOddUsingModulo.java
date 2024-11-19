// Write a Java Program to print given number is even or odd using modulous operator.

import java.util.*;
class evenOddUsingModulo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter an Integer Number: ");
        int number = sc.nextInt();
        if(number % 2 == 0){
            System.out.print("Given Number is Even ");
        }
        else{
            System.out.print("Given Number is Odd ");
        }
        sc.close();
    }
}