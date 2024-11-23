// Check prime or not use optimise approach
import java.util.*;
public class CheckPrimeOptimize {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = sc.nextInt();
        boolean isPrime = true;
        for(int i=2; i<Math.sqrt(number); i++){
            if(number%i==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.print("Given number is prime ");
        }
        else{
            System.out.print("Given number is not a prime number ");
        }
        sc.close();
    }
}