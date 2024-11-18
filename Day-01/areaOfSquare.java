import java.util.*;
public class areaOfSquare {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of a square: ");
        int side = sc.nextInt();
        int area = 4*side;
        System.out.print("Area of square is: "+area);
        sc.close();
    }
}
