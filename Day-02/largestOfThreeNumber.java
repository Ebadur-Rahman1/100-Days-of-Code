// Write a Java Program for Largest of three number.

import java.util.*;
public class largestOfThreeNumber {
    public static void main(String srgs[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();
        System.out.print("Enter Third Number: ");
        int c = sc.nextInt();
        if((a>=b) && (a>c)){
            System.out.print(a + " is greatest ");
        }
        else if(b>=c){
            System.out.print(b + " is greatest ");
        }
        else{
            System.out.print(c+ " is greatest ");
        }
        sc.close();
    }
}
