// Write a method to compute the sum of the digits in an integer.
import java.util.*;
public class SumOfDigit{
    public static int sum(int n){
        int sum = 0;
        while(n>0){
            int lastDigit = n%10;
            sum = sum+lastDigit;
            n = n/10;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter an integer ");
        int number = sc.nextInt();
        int ans = sum(number);
        System.out.print("Sum of digit is " + ans);
        sc.close();
    }
}