// Write a program to calculate Binomial Coefficient ncr = n!/(r!(n-r)!) using function
import java.util.*;

public class BinomialCoefficient {

    public static int fact(int a){
        int factorial = 1;
        for(int i=1; i<=a; i++){
            factorial = factorial * i;
        }
        return factorial;
    }

    public static int binomial(int n, int r){

        int binomialValue = fact(n)/(fact(r) * fact(n - r));
        return binomialValue;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Please enter the value of r: ");
        int r = sc.nextInt();

        int ans = binomial(n,r);
        System.out.print("Binomial Coefficient is:  "+ ans);
        sc.close();
    }    
}
