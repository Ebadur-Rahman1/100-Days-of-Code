// Linear Search: Find the index of element in a given array [2,4,6,8,10,12,14,16], Key=10.
public class LinearSearch {
    public static int searchArray(int arr[],int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                return i;
            }
        } return -1;
    }
    public static void main(String[] args){
        int arr[] = {2,4,6,8,10,12,14,16};
        int key = 14;
        int index = searchArray(arr,key);

        if(index == -1){
            System.out.println("Element not found ");
        }
        else{
            System.out.println(key + " is present at "+ index);
        }

    }
}