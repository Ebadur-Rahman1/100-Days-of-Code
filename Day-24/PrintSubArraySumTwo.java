// For better time complexity use Prefix Sum Method. TC = O(n^2)
// int arr[] = {1, -2, 6, -1, 3}
// first subArray: (1) , (1, -2) , (1,-2, 6) , (1, -2, 6, -1) , (1, -2, 6, -1, 3)
// second subArray: (-2) , (-2, 6) , (-2, 6, -1) , (-2, 6, -1, 3)
// so on...


public class PrintSubArraySumTwo {
    public static int prefixSubArraySum(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int prefixArray[] = new int[arr.length];
        prefixArray[0] = arr[0];
        int sum = 0;

        for(int i=1; i<arr.length; i++){
            prefixArray[i] = prefixArray[i-1] + arr[i];
        }

        for(int j=0; j<arr.length; j++){
            int start = j;
            for(int k=j; k<arr.length; k++){
                int end = k;
                sum = start == 0 ? prefixArray[end] : prefixArray[end] - prefixArray[start-1];
                if(sum>maxSum){
                    maxSum = sum;
                }
            }
        }
        
        return maxSum;
    }
    public static void main(String[] args){
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        int result = prefixSubArraySum(arr);
        System.out.println(result);
    }
}