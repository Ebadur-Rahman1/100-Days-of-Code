import java.util.*;
public class sum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Your First Number: ");
        int a = sc.nextInt();
        System.out.print("Please Enter Second Number: ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("Sum of "+ a + " and " + b + " is "+ sum);

        sc.close();
    }
    
}
