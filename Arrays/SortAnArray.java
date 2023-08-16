package Arrays;

public class SortAnArray {
    public static int[] sortArray(int[] nums) {
        return mergeArray(nums, 0, nums.length-1);
    }

    static int[] mergeArray(int[] arr, int l, int h) {
        if(l == h) {
            int[] b = new int[1];
            b[0] = arr[l];
            return b;
        }

        int mid = (l+h)/2;
        int[] f = mergeArray(arr, l, mid);
        int[] sec = mergeArray(arr, mid+1, h);
        return mergeTwoSortedArray(f, sec);
    }

    static int[] mergeTwoSortedArray(int[] array1, int[] array2) {
        int[] arr = new int[array1.length + array2.length];
        int j = 0;
        int m = 0;
        int n = 0;

        while(m < array1.length && n < array2.length) {
            if(array1[m] < array2[n]) {
                arr[j++] = array1[m];
                m++;
            } else {
                arr[j++] = array2[n];
                n++;
            }
        }
        while(m < array1.length) {
            arr[j++] = array1[m];
            m++;
        }
        while(n < array2.length) {
            arr[j++] = array2[n];
            n++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] a = {10, 5, 8, 2, 1};
        int[] ans = (sortArray(a));
        for(int i=0;i<ans.length;i++) {
            System.out.print(ans[i]+" ");
        }
    }
}

// Time Complexity : O(nlogn)
//  Space Complexity : O(m+n)