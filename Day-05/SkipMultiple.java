// Keep entering number till user enter multiple of 10 using do while
import java.util.*;
public class SkipMultiple {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int number = 0;
    

    do{
        System.out.print("Please enter a number: ");
        number = sc.nextInt();   
         
    }while(number%10 !=0);

    System.out.println("You entered a multiple of 10. Program ends.");

    sc.close();
    }
}
