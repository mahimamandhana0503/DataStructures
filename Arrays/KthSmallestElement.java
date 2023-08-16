package Arrays;

import java.util.PriorityQueue;

public class KthSmallestElement {
    public static int kthSmallest(int[] arr, int l, int r, int k) { 
        PriorityQueue<Integer> p = new PriorityQueue<>();
        
        for(int i=0;i<arr.length;i++) {
            p.add(arr[i]);
        }
        
        while(k-1>0) {
            p.poll();
            k--;
        }
        
        return p.peek();
    } 

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        System.out.println(kthSmallest(arr, 0, 0, 3));
    }
}