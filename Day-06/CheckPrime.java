// Check prime or not using normal approach.
import java.util.*;

class CheckPrime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number to check weather number is prime or not: ");
        int number = sc.nextInt();
        boolean isPrime = true;
        for(int i=2; i<number; i++){
            if(number%i==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.print("Given number is prime ");
        }
        else{
            System.out.print("Given number is no a prime number ");
        }
        sc.close();
    }
}