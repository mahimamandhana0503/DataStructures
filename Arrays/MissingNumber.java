package Arrays;

public class MissingNumber {
    static int missingNumber(int[] a, int n) {
        int missing = 0;

        int[] arr = new int[n+1];

        for(int i=0;i<a.length;i++) {
            arr[a[i]] = 1;
        }

        for(int i=1;i<arr.length;i++) {
            if(arr[i] == 0)
                missing = i;
        }

        return missing;
    }

    public static void main(String[] args) {
        int[] a = {6,1,2,8,3,4,7,10,5};
        System.out.println(missingNumber(a, 10));
    }
}

// Time Complexity : O(n)
//  Space Complexity : O(n)