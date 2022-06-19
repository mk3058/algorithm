package project;

import java.util.Scanner;

class YMD {
    int y;
    int m;
    int d;

    final int[] months = { 31, 30, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public YMD(int y, int m, int d) {
        if (!((1 <= m && m <= 12) && (1 <= d && d <= 31))) {
            System.out.println("잘못된 입력입니다.");
            System.exit(1);
        } else {
            this.y = y;
            this.m = m;
            this.d = d;
        }
    }

    public void after(int n) {
        d += n;

        while (d > months[m - 1]) {
            d -= months[m - 1];
            m++;
            while (m > 12) {
                m -= 12;
                y++;
            }
        }

        System.out.printf("%d일 뒤의 날짜는 %d년 %d월 %d일 입니다.\n", n, y, m, d);
    }

    public void before(int n) {
        d -= n;

        while (d < 1) {
            m--;
            while (m < 1) {
                y--;
                m += 12;
            }

            d += months[m - 1];
        }

        System.out.printf("%d일 전의 날짜는 %d년 %d월 %d일 입니다.\n", n, y, m, d);
    }
}

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("날짜 입력(년 월 일) : ");
        YMD ymd = new YMD(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

        // ymd.after(7720);
        ymd.before(770);

        scanner.close();
    }
}
