// Write a Java Program for income tax calculator.
import java.util.*;
public class incomtaxCalculator {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter your income: ");
    int income = sc.nextInt();
    double tax;
    if(income<=250000){
        tax = 0;
    }
    else if(income<=500000){
        tax = (income - 250000)*0.05;
    }
    else if(income<=100000){
        tax = (250000*0.05)+ ((income-500000) * 0.2);
    } else {
        tax = (250000*0.05) + (500000 * 0.2) + ((income-100000)*0.3);
    }

    System.out.print("Calculated Tax: " + tax);
    sc.close();
    }
}
