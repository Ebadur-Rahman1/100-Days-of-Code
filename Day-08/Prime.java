// Write a program to find number is prime or not using function (Optimize solution: Math.sqrt()).
import java.util.*;

public class Prime {
    public static boolean prime(int number){
        boolean isPrime = true;
        for(int i=2; i<=Math.sqrt(number); i++){
            if(number%i==0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please a number to check prime: ");
        int number = sc.nextInt();
        boolean ans = prime(number);
        if(ans == true){
            System.out.print("Given number is prime ");
        }
        else{
            System.out.print("Given number is not a prime ");
        }
        sc.close();

    }
}
