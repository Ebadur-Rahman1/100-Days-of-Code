// Write a program to Convert Binary to Decimal.
import java.util.*;
public class BinaryToDecimal {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a binary number: ");
        int binary = sc.nextInt();
        int decimal = 0;
        int i=0;
        while(binary>0){
            int lastDigit = binary % 10;
            decimal = decimal + (lastDigit * (int)Math.pow(2,i));
            i++;
            binary = binary / 10;
        }
        System.out.print("Converted Decimal number is: "+ decimal);
        sc.close();
    }
}
