package project;

public class Q3 {
    static int sumOf(int[] a) {
        int tot = 0;
        for (int i = 0; i < a.length; i++) {
            tot += a[i];
        }

        return tot;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };

        System.out.println(sumOf(a));
    }
}
