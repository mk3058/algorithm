package project;

import java.util.Scanner;

public class Q17 {
    static void spira(int n) {
        int i, j, k;

        for (i = 1; i <= n; i++) {
            for (j = 0; j <= (n - 1) - i; j++)
                System.out.print(" ");
            for (k = 1; k <= 2 * i - 1; k++)
                System.out.print(i);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        spira(scanner.nextInt());
        scanner.close();
    }
}