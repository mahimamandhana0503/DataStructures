package Strings;

class ReverseString {
    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length-1;

        while(start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        System.out.print(s);
    }
}

// Time Complexity : O(n)
//  Space Complexity : O(1)