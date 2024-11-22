// Write a program to calculate sum of n natural numbers

import java.util.*;
public class SumOfNaturalNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please a natural number: ");
        int number = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=number; i++){
            sum = sum +i;
        }
        System.out.print("Sum of given number is: "+sum);
        sc.close();
    }
}
