// Write a program to swap two numbers without using third variable
import java.util.*;
public class SwapWithoutUsing {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter value of A: ");
        int a = sc.nextInt();
        System.out.print("Please enter value of B: ");
        int b = sc.nextInt();
        System.out.println("Old value of A is "+ a + " and b is "+ b) ;
         a = a + b;
         b = a - b;
         a = a - b;
         System.out.print("New value of A is "+ a + " and b is "+ b) ;
         sc.close();
    }
}
