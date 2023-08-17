package Arrays;

import java.util.ArrayList;

public class SubArraySum {
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0 ;
        int start = 0;

        for(int i=0;i<n;i++) {
            sum += arr[i];
            while(sum > s && start < i) {
                sum -= arr[start++];
            }
            if(sum == s) {
                list.add(start+1);
                list.add(i+1);
                break;
            }
        }
        if(list.isEmpty()) {
            list.add(-1);
        }

       

        return list;
    }

    public static void main(String[] args) {
        int[] a = {135, 101, 170, 125, 79, 159, 163, 65, 106, 146 ,82 ,28 ,162 ,92 ,196 ,143 ,28 ,37 ,192 ,5 ,103 ,154 ,93 ,183 ,22 ,117 ,119 ,96 ,48 ,127 ,172 ,139 ,70 ,113 ,68 ,100 ,36 ,95 ,104 ,12 ,123,134};
        ArrayList<Integer> list = subarraySum(a, 42, 468);

        System.out.println(list);
    }
}

// Time Complexity : O(n)
//  Space Complexity : O(1)