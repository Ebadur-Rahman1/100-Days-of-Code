// Reverse an array with the help of second array.

public class ReverseArray {
    public static void reverseArray(int arr[]){
        int n = arr.length;
        int reverseArray[] =  new int[n];
        for(int i = 0; i<n; i++){
            reverseArray[i] = arr[n-i-1];
        }
        // copy reverse array in main array
        for(int j=0; j<(reverseArray.length); j++){
            arr[j] = reverseArray[j];
        }
    }
    public static void main(String args[]){
        int arr[] = {2,4,6,8,10};
        reverseArray(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }    
}