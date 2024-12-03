// Write a program to Calculate HCF of two number.

import java.util.*;

public class CalculateHCF {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter two numbers: ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    for(int l=(a<b)?a:b; l>=1; l--){
        if(a%l==0 && b%l==0){
            System.out.print("HCF of "+ a + " and "+ b + " is " + l);
            break; 
        }
    }
    sc.close();
    }

}
