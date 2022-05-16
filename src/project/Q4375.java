package project;

import java.util.Scanner;

public class Q4375 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = 1;
        int cnt = 1;

        while (true) {
            int input = scanner.nextInt();
            while (true) {
                if (num % input == 0) {
                    System.out.println(cnt);
                    break;
                }
                num += Math.pow(10, cnt);
                cnt++;
            }
        }
    }
}
