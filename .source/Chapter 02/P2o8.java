package project;

import java.util.Scanner;
import java.util.Arrays;

public class P2o8 {
    static int cardConvR(int x, int r, char[] d) {
        String dchar = "0123456789ABCDEF";
        int digits = 0;

        while (true) {
            int i = 0;
            d[i] = dchar.charAt(x % r);
            digits++;
            i++;
            x /= r;
            if (x == 0)
                break;
        }

        return digits;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int no;
        int cd;
        int dno;
        int retry;
        char[] cno = new char[32];

        do {
            System.out.println("10진수를 기수 변환 합니다.");
            System.out.print("변환하는 음이 아닌 정수 : ");
            no = scanner.nextInt();
            System.out.print("어떤 진수로 변환할까요?(2~36)");
            cd = scanner.nextInt();
            dno = cardConvR(no, cd, cno);

            System.out.print(cd + "진수로는 ");
            for (int i = dno - 1; i >= 0; i--) {
                System.out.printf("%c", cno[i]);
            }
            System.out.println(" 입니다");

            System.out.print("한번 더 할까요?(1.예 / 2.아니요)");
            retry = scanner.nextInt();
        } while (retry == 1);

        scanner.close();
    }
}
