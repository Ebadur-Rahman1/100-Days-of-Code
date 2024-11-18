import java.util.*;
public class itemWithGST {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost of first item: ");
        int a = sc.nextInt();
        System.out.print("Enter cost of second item: ");
        int b = sc.nextInt();
        System.out.print("Enter const of third item: ");
        int c = sc.nextInt();
        int sum = a + b + c;
        float gst = sum * (18/100f);
        float total = sum+gst;
        System.out.print("Total price with GST: " + sum + " GST " + gst + " = " + total);
        sc.close();
    }
}
