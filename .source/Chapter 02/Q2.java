package project;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
    public void swap(int[] a, int index1, int index2) {
        int tmp = a[index1];
        a[index1] = a[index2];
        a[index2] = tmp;
        System.out.printf("a[%d]와 a[%d]를 교환합니다!\n", index1, index2);
    }

    public void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            swap(a, i, a.length - 1 - i);
            System.out.println(Arrays.toString(a));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Q2 q2 = new Q2();

        System.out.print("요소수 입력 : ");
        int num = scanner.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }

        q2.reverse(arr);
        scanner.close();
    }
}
