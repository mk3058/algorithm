package project;

import java.util.Scanner;

public class Q8 {
    static int isLeap(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 != 0)
                return 1;
        }
        return 0;
    }

    static int dayOfYear(int year, int month, int day) {
        final int days[][] = {
                { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 평년
                { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } // 윤년
        };

        month--;
        while (month > 0) {
            day += days[isLeap(year)][(month--)];
        }

        return day;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int retry = 0;

        System.out.println("해당 년도의 경과 일수를 구합니다");

        do {
            System.out.print("년 : ");
            int year = scanner.nextInt();
            System.out.print("월 : ");
            int month = scanner.nextInt();
            System.out.print("일 : ");
            int day = scanner.nextInt();

            System.out.printf("그 해 %d일째입니다.\n", dayOfYear(year, month, day));
            System.out.print("한번 더 할까요? : ");

            retry = scanner.nextInt();
        } while (retry == 1);

        scanner.close();
    }
}