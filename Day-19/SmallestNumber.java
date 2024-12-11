// Find the smallest number in a given array

public class SmallestNumber {
    public static int smallestNumberInArray(int arr[]){
        int maxValue = Integer.MAX_VALUE;
            for(int i=0; i<arr.length; i++){
                if(arr[i]<maxValue){
                    maxValue = arr[i];
                }
            }
            return maxValue;
    }
    public static void main(String args[]){
        int arr[] = {44,5,3,6,8,10};
        System.out.println("Smallest number in the given array: " + smallestNumberInArray(arr));
    }
}
