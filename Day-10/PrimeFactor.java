// Write a program to print all prime factors.
import java.util.*;

public class PrimeFactor {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number ");
        int number = sc.nextInt();

        for(int i=2; number>1; i++){
            while(number % i == 0){
                System.out.print(i +" ");
                number = number/i;
            }
        }
        sc.close();
    }
}
