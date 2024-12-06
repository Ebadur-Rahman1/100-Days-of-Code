// Write a method to print fibonacci series 
import java.util.*;
public class Fibonacci {
    public static void printSeries(int n){

        int firstTerm = 0;
        int secondTerm = 1;
        System.out.print("Fibonacci Series ");
        for(int i=0; i<n; i++){
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            secondTerm = firstTerm;
            firstTerm = nextTerm;

        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = sc.nextInt();
        printSeries(number);
        sc.close();
    }
}
