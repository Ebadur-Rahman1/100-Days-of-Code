// Write a program to print number from 1 to n using while loop.
import java.util.*;
class printNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = sc.nextInt();
        int start = 1;
        while(start<number){
            System.out.print(start + " ");
            start++;
        }
        sc.close();
    }
}