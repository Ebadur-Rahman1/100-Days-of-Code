// Write a Java Program to print largest of two numbers.

import java.util.*;
public class largestOfTwoNumber {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Frist Number: ");
    int a = sc.nextInt();
    System.out.print("Enter Second Number: ");
    int b = sc.nextInt();
    if(a>b){
        System.out.print("First Number is Greater ");
    }
    else if(b>a){
        System.out.print("Second number is greater ");
    }
    else{
        System.out.print("Both are equal ");
    }
    sc.close();
    }
}
