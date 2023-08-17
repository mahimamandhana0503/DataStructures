package Arrays; 

class Sort012 {
    public static void sort012(int a[], int n) {
        int l = 0;
        int h = n-1;
        int m = (l+h)/2;

        while(m<=h) {
            if(a[m] == 0) {
                swap(a, l++, m);
            } else if(a[m] == 1) {
                m++;
            } else {
                swap(a, h--, m);
            }
        }

        for(int i=0;i<n;i++) {
            System.out.print(a[i]+" ");
        }
    }

    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        int[] a = {2,1,0,0,1,2};
        sort012(a, 6);
    }
}

// Time Complexity : O(n)
//  Space Complexity : O(1)