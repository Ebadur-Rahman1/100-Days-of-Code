// Write a program to swap two numbers using third variable
import java.util.*;
public class Swap {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter value of A: ");
        int a = sc.nextInt();
        System.out.print("Please enter value of B: ");
        int b = sc.nextInt();
        System.out.println("Old value of A is "+ a + " and b is "+ b) ;
        int temp = a;
         a = b;
         b = temp;
         System.out.print("New value of A is "+ a + " and b is "+ b) ;
         sc.close();
    }
}
