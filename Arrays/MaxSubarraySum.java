package Arrays;

public class MaxSubarraySum {
    static long maxSubarraySum(int arr[], int n){
        
        // Your code here
        if(arr.length == 1) {
            return arr[0];
        }

        long max = Math.max(arr[0], arr[1]);
        int sum = arr[0];
        
        for(int i=1;i<n;i++) {
            sum += arr[i];
            if(arr[i] > sum) {
                sum = arr[i];
            }
            if(max < sum) {
                max = sum;
            }
        }
        return max;
        
    }

    public static void main(String[] args) {
        int[] a = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubarraySum(a, a.length));
    }
}

// Time Complexity : O(n)
// Space Complexity : O(n)
