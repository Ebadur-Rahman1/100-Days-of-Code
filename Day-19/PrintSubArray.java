// Print subarray: A continuous part of array
// 2
// 2 4
// 2 4 6
// 2 4 6 8
// 2 4 6 8 10
// 4
// 4 6
// 4 6 8
// 4 6 8 10
// 6
// 6 8
// 6 8 10
// 8
// 8 10
// 10


public class PrintSubArray {
    public static void printSubArray(int number[]){
        for(int i=0; i<number.length; i++){
            int start = i;
            for(int j=i; j<number.length; j++){
                int end = j;
                for(int k=start; k<=end; k++){
                    System.out.print(number[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int arr[] = {2,4,6,8,10};
        printSubArray(arr);
    }
}
