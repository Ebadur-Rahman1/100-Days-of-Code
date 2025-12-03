// By using Kadan's Algorithm solved the question in O(n)

public class PrintSubArraySumThree {
    public static int maxSubArraySum(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        int maxElement = Integer.MIN_VALUE;
        boolean allNegative = true;

        for(int i=0; i<arr.length; i++){

            if (arr[i] >= 0) {
                allNegative = false;
            }
            // Track max element in case all are negative
            maxElement = Math.max(maxElement, arr[i]);

            currSum = currSum + arr[i];
            if(currSum<0){
                currSum = 0;
            }

            maxSum = Math.max(currSum, maxSum);
        }
        // If all numbers were negative return the largest negative
        if (allNegative) {
            return maxElement;
        }
        return maxSum;
    }
    public static void main(String[] args){
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        int result = maxSubArraySum(arr);
        System.out.println(result);
    }    
}
