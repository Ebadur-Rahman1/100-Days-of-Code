// Write a program to get a number from the user and print whether it is positive or negative.
import java.util.*;

public class positiveNegative {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = sc.nextInt();
        if(number>0){
            System.out.print("Given number is positive ");
        }
        else if(number<0){
            System.out.print("Given number is Negative ");

        }
        else{
            System.out.print("Given number is neither positive nor negative ");
        }
        sc.close();
    }
}
