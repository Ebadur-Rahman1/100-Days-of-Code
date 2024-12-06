/** An Armstrong number (also known as a narcissistic number, pluperfect digital invariant (PPDI),
 or pluperfect number) is a number that is equal to the sum of its own digits raised to the power
  of the number of digits. **/

// Write a method to check armstrong number.
import java.util.*;

public class ArmstrongNumber {

    public static int NumberOfDigit(int num){
        int count = 0;
        while(num>0){
            count++;
            num = num / 10;
        }
        return count;
    }

    public static void CheckArmstrong(int n){
       int armstrongSum = 0;
       int originalNumber = n;
       int count = NumberOfDigit(n);
       while(n>0){
        int firstSum = 0;
        int lastDigit = n % 10;
        for(int i=1; i<=count; i++){
            firstSum = (int)Math.pow(lastDigit,count);
        }
        armstrongSum = armstrongSum + firstSum;
        n = n /10; 
       }

       if(originalNumber == armstrongSum){
        System.out.println("Given number is armstrong number. ");
       }
       else{
        System.out.println("Given number is not an armstrong number. ");
       }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number to check armstrong: ");
        int number = sc.nextInt();
        CheckArmstrong(number);
        sc.close();
    }
}
