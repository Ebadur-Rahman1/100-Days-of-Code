import java.util.*;

public class areaOfCircle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of Circle: ");
        int r = sc.nextInt();
        float pi = 3.14F;
        float area = 2*pi*r*r;
        System.out.print("Area of Circle is: "+ area);
        sc.close();
    }
}
