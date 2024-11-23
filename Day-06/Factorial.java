// Write program to find the factorial of any number entered by the user
import java.util.*;
public class Factorial {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = sc.nextInt();
        int fact = 1;
        for(int i=1; i<=number; i++){
            fact = fact * i;
        }
        System.out.print("Factorial of a given number: "+ fact);
        sc.close();
    }
}
