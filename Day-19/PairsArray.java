// Print pairs an array.
// Array = {2,4,6,8,10}
// sub array1: (2,4) (2,6) (2,8) (2,10)
// sub array2: (4,6)(4,8)(4,10)
// sub array3: (6,8) (6,10)
// sub array4: (8,10)

public class PairsArray {
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                System.out.print("("+ arr[i] + ","+arr[j]+ ")");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int arr[] = {2,4,6,8,10};
        printArray(arr);
    }
}
