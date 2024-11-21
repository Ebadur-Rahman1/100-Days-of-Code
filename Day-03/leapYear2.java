// Leap year with another logic
import java.util.*;
public class leapYear2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter year: ");
        int year = sc.nextInt();
        if(year % 100 == 0){
            if(year % 400 == 0){
                System.out.print("Leap year ");
            }
            else{
                System.out.print("Not a leap year ");
            }
        }
        else{
            if(year % 4 == 0){
                System.out.print("Leap year ");
            }
            else{
                System.out.print("Not a leap year ");
            }
        }
        sc.close();
    }
}
