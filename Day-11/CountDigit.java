// Write a method to count digit in a number.
import java.util.*;
public class CountDigit {
    public static int count(int n){
        int count = 0;
        while(n>0){
            n = n /10;
            count++;
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = sc.nextInt();
        System.out.print("Total number of digit: "+ count(number));
        sc.close();
    }
}
