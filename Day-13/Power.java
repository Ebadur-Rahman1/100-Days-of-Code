// Write a program to Calculate x power y.
import java.util.*;
public class Power{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the base (X): ");
        int base = sc.nextInt();
        System.out.print("Please enter the exponent (Y): ");
        int exponent = sc.nextInt();
        int ans = 1;
        for(int i=1; i<=exponent; i++){
            
            ans *=  base;
        }
        System.out.print("Ans is: "+ ans);
        sc.close();
    }
}