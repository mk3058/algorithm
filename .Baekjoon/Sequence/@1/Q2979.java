package project;

import java.util.Scanner;

public class Q2979 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] cnt = new int[99];
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int ans = 0;

        for (int i = 0; i < 3; i++) {
            int in = scanner.nextInt();
            int out = scanner.nextInt();

            for (int j = in - 1; j < out - 1; j++) {
                cnt[j]++;
            }
        }

        for (int x : cnt) {
            switch (x) {
                case 1:
                    ans += (1 * a);
                    break;
                case 2:
                    ans += (2 * b);
                    break;
                case 3:
                    ans += (3 * c);
                    break;
            }
        }

        System.out.println(ans);
        scanner.close();
    }
}
