// Leap Year

import java.util.*;
public class leapYear {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter year: ");
        int year = sc.nextInt();

        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));
        if(x && (y || z)){
            System.out.print("Leap Year ");
        }
        else{
            System.out.print("Not a leap year ");
        }

        sc.close();
    }
    
}
