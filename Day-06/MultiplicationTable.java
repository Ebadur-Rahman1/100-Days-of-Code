// Write a program to print the multiplication table of a number N, entered by the user.
import java.util.*;
public class MultiplicationTable {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number you want to print the table: ");
        int table = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(i + " * " + table + " = "+ i*table);
        }

        sc.close();
    }
}
