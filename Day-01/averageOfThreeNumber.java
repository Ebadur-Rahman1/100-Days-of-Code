import java.util.*;
public class averageOfThreeNumber {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter First Number: ");
    int a = sc.nextInt();
    System.out.print("Enter Second Number: ");
    int b = sc.nextInt();
    System.out.print("Enter Third Number: ");
    int c = sc.nextInt();
    float avg = (a+b+c)/3;
    System.out.print("Average of Given number is: "+avg);
    sc.close();
    }
}
