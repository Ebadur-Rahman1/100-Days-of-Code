// Find the index of a given element using binary search
public class BinarySearch {
    public static int search(int arr[],int key){
        int start = 0, end = arr.length - 1;

        while(start<=end){
            int mid = (start + end) / 2;
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid]<key){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {2,4,6,8,10};
        int key = 4;
        int i = search(arr,key);
        if(i!=-1){
        System.out.println("Key is present at "+ search(arr,key));
        }
        else{
            System.out.println("Key is not present in the given array ");
        }
    }
    
}
