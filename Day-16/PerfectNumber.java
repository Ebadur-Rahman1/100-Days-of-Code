// Write a method to check perfect number.
import java.util.*;
public class PerfectNumber {
    public static void checkPerfect(int n){
        int factorSum = 0;
        for(int i=1; i<n; i++){
            if(n%i==0){
                factorSum = factorSum + i;
            }
        }
        if(factorSum == n){
            System.out.print("Given number is perfect number. ");
        }
        else{
            System.out.print("Given number is not a perfect number. ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number to check if it's a perfect number: ");
        int number = sc.nextInt();
        checkPerfect(number);
        sc.close();
    }
}
