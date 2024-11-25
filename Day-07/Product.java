// Product of two number using function.
import java.util.*;

public class Product {

    public static int product(int num1, int num2){
        int product = num1 * num2;
        return product;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Please enter second number: ");
        int num2 = sc.nextInt();
        
        System.out.print("Product of "+ num1 + " and " + num2 + " is " + product(num1,num2));
        sc.close();
    }
}
