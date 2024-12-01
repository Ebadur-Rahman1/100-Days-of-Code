// Find the root of a quadratic equation
import java.util.*;
public class QuadraticRoot {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the co-officient of a: ");
        int a = sc.nextInt();
        System.out.print("Please enter the co-officient of b: ");
        int b = sc.nextInt();
        System.out.print("Please enter the co-officient of c: ");
        int c = sc.nextInt();
        double descriminate = (b*b)-4*a*c;
        if(descriminate >0){
            double root1 = (- b + Math.sqrt(descriminate))/(2 * a);
            double root2 = (- b - Math.sqrt(descriminate))/(2 * a);
            System.out.print("Distinct Root of the equation are "+ root1 + " and "+ root2);
        }
        else if(descriminate == 0){
            double root = (- b) / (2 * a);
            System.out.print("One real roots: " + root);
        }
        else{
            System.out.print("No real roots, Roots are imaginary ");
        }

        sc.close();
    }
}
