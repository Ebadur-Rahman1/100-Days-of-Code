// Find the largest number in a given array 

public class LargestNumber {
    public static int largestNumberInArray(int arr[]){
        int maxNumber = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>maxNumber){
                maxNumber = arr[i];
            }
        }
        return maxNumber;

    }
    public static void main(String args[]){
        int arr[] = {2,4,6,8,100,12,14,16,18,20};
        System.out.println("Largest number in the given array is: "+ largestNumberInArray(arr));
        
    }
}
