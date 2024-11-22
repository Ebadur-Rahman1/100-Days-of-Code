// Print reverse of a number. (Only print no need to construct a new reversed number)
// % operator gives us last digit of a number or Remainder of a number.
import java.util.*;
public class PrintReverseNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = sc.nextInt();
        while(number>0){
            int lastDigit = number%10;
            System.out.print(lastDigit);
            number = number/10;
        }
        sc.close();
    }
}