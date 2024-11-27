// Print prime numbers between two numbers
import java.util.*;

public class PrimeBetweenTwo {

    public static boolean isPrime(int a){
        if(a<=1){
            return false;
        }
        for(int i=2; i<=Math.sqrt(a); i++){
            if(a%i==0){
                return false;
                
            }
        }
        return true;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter starting number ");
        int a = sc.nextInt();
        System.out.print("Please enter ending number ");
        int b = sc.nextInt();

        for(int i=a; i<=b; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
        sc.close();
    }    
}
