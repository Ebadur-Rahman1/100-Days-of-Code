// Write a program to Calculate LCM of two number.
import java.util.*;
public class CalculateLCM {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int l=(a>b) ? a : b; l<= a*b; l++){
            if((l%a==0) && (l%b==0)){
                System.out.print("LCM of "+ a + " and "+ b + " is " + l);
                break;
            }
        }
        
        sc.close();
    }
    
}
