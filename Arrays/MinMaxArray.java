package Arrays;

class Pair  {  
    long first, second;  
    public Pair(long first, long second) {  
        this.first = first;  
        this.second = second;  
    }  
}

public class MinMaxArray {
    static Pair getMinMax(long a[], long n) {
        long min = Long.MAX_VALUE;
        long max = 0;

        for(int i=0;i<n;i++) {
            if(a[i] < min) {
                min = a[i];
            } 
            if(a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Min: "+min);
        System.out.println("Max: "+max);

        return new Pair(min, max); 
    }

    public static void main(String[] args) {
        long[] a = {1, 345, 234, 21, 56789};
        System.out.println(getMinMax(a, a.length));
    }
}

// Time Complexity : O(n)
//  Space Complexity : O(1)
