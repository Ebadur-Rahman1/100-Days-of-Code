// Write a program to take input week number(1-7) and print day of week name using switch case.

import java.util.*;
public class weekDays{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Please enter week number from 1 to 7 ");
       int number = sc.nextInt();
       
       switch(number){
        case 1:
            System.out.print("Monday");
            break;
        case 2:
            System.out.print("Tuesday");
            break;
        case 3:
            System.out.print("Wednesday");
            break;
        case 4:
            System.out.print("Thursday");
            break;
        case 5:
            System.out.print("Friday");
            break;
        case 6:
            System.out.print("Saturday");
            break;
        case 7:
            System.out.print("Sunday");
            break;
        default :
            System.out.print("Invalid Input ");
        
       }
       sc.close();
    }
}