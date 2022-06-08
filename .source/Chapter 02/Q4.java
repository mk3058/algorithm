package project;

import java.util.Arrays;

public class Q4 {
    static void copy(int[] a, int[] b) {
        for (int i = 0; i < b.length; i++) {
            a[i] = b[i];
        }
    }

    public static void main(String[] args) {
        int[] b = { 1, 22, 33, 44, 55 };
        int[] a = new int[b.length];

        copy(a, b);
        System.out.println(Arrays.toString(a));
    }
}
