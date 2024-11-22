// Reverse the given number.(constructing a new number).
import java.util.*;
public class ReverseNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = sc.nextInt();
        int newNumber=0;

        while(number>0){
            int lastDigit = number%10;
            newNumber = newNumber * 10 + lastDigit;
            number = number/10;
        }
        System.out.print("Reversed Number: "+ newNumber);
        sc.close();
    }
}
