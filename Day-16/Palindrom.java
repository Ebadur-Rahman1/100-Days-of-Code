// Write a method to check wheather given number is palindrom or not.
import java.util.*;
public class Palindrom {
    public static void CheckPalindrom(int number){
        int originalNumber = number;
        int reverse = 0;
        while(number>0){
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number / 10;
        }
        if(reverse == originalNumber){
            System.out.print("Given number is palindrom ");
        }
        else {
            System.out.print("Given number is not a palindrom ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number to check palindrom: ");
        int number = sc.nextInt();
        CheckPalindrom(number);
        sc.close();
    }
}
