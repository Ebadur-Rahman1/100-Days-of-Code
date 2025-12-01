// SubArray: A continuous part of array arr[] = {1, -2, 6, -1, 3}
// 1            |             |         |       |
// 1 -2         | -2          |         |       |
// 1 -2 6       | -2 6        | 6       |       |
// 1 -2 6 -1    | -2 6 -1     | 6 -1    | -1    |
// 1 -2 6 -1 3  | -2 6 -1 3   | 6 -1 3  | -1 3  | 3

// *********************************************************

// Brute Force Approach  TC= O(n^3)
// int arr[] = {1, -2, 6, -1, 3}
// first subArray: (1) , (1, -2) , (1,-2, 6) , (1, -2, 6, -1) , (1, -2, 6, -1, 3)
// second subArray: (-2) , (-2, 6) , (-2, 6, -1) , (-2, 6, -1, 3)
// so on... 

public class PrintSubArray {
    public static void printSubArrays(int arr[]){
        for(int i=0; i<arr.length; i++){
            int start = i;
            for(int j=i; j<arr.length; j++){
                int end = j;
                for(int k=start; k<=end; k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int arr[] = {1, -2, 6, -1, 3};
        printSubArrays(arr);
    }
}