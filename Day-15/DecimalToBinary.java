// Write a program to Convert Decimal to Binary.
import java.util.*;
public class DecimalToBinary {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a decimal number ");
        int decimal = sc.nextInt();
        int binary = 0;
        int i=0;
        
        while(decimal>0){
            int lastDigit = decimal % 2;
            binary = binary + lastDigit * (int)Math.pow(10,i);
            i++;
            decimal = decimal / 2;

        }
        System.out.print("Converted Binary number is: "+ binary);
        sc.close();
    }
}
