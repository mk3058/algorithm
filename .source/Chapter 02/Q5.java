package project;

import java.util.Arrays;


public class Q5 {
    static void rcopy(int[] a, int[] b) {
        int size = b.length;

        for (int i = 0; i < size; i++) {
            a[size - 1 - i] = b[i];
        }
    }

    
    public static void main(String[] args) {
        int[] b = { 1, 22, 33, 44, 55 };
        int[] a = new int[b.length];

        rcopy(a, b);
        System.out.println(Arrays.toString(a));
    }
}
