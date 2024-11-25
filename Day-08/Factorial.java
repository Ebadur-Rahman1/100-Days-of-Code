// Factorial of given number using function.
import java.util.*;
public class Factorial {
    public static int fact(int number){
        int fact = 1;
        for(int i=1; i<=number; i++){
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number to find the factorial: ");
        int number = sc.nextInt();
        System.out.print("Factorial of a given number: "+ fact(number));
        sc.close();
    }
}
