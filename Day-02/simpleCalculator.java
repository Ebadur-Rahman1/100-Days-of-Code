// Simple calculator using swithc 

import java.util.*;
public class simpleCalculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter first operand: ");
        int a = sc.nextInt();
        System.out.print("Please enter second operand: ");
        int b = sc.nextInt();
        System.out.print("Please enter operator(+,-,*,/): ");
        char operator = sc.next().charAt(0);
        int result;
        switch(operator){
            case '+':
                result = a + b;
                System.out.print("Result is: "+result);
                break;
            case '-':
                 result = a - b;
                 System.out.print("Result is: "+result);
                 break;
            case '*':
                 result = a * b;
                 System.out.print("Result is: "+result);
                 break;
            case '/':
                    if(b!=0){
                     result = a / b;
                 System.out.print("Result is: "+result);
                 break;
                    }
                    else{
                        System.out.print("Can not devide by 0 ");
                    }
            default:
                    System.out.print("Invalid Input ");
        }
        sc.close();
    }
}
