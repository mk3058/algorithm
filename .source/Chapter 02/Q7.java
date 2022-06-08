package project;

import java.util.Scanner;

public class Q7 {
    static void reverse(char[] d) {
        int size = d.length;

        for (int i = 0; i < size / 2; i++) {
            char tmp = d[i];
            d[i] = d[size - 1 - i];
            d[size - 1 - i] = tmp;
        }
    }

    static void cardConv(int x, int r, char[] d) {
        String dchar = "0123456789ABCDEFGHIJKLNMQRSTUVWXYZ";
        int i = 0;

        System.out.println(r + "|    " + x);
        System.out.println(" +-------");

        do {
            int remainder = x % r;
            x /= r;

            d[i] = dchar.charAt(remainder);
            i++;

            System.out.println(r + "|    " + x + " --- " + remainder);
            System.out.println(" +-------");
        } while (x > 0);

        reverse(d);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int no; // 변환하는 정수
        int cd; // 기수
        int retry;
        char[] cno = new char[32]; // 변환 후

        do {
            System.out.println("10진수를 기수 변환 합니다");
            System.out.print("변환하는 음이 아닌 정수 : ");
            no = scanner.nextInt();

            do {
                System.out.print("어떤 진수로 변환 할까요? : ");
                cd = scanner.nextInt();
            } while (!(2 <= cd && cd <= 36));

            cardConv(no, cd, cno);

            System.out.print(cd + "진수로는 ");
            System.out.print(cno);
            System.out.println("입니다.");

            System.out.print("한번 더 할까요? (1.예 / 2.아니오) : ");
            retry = scanner.nextInt();
        } while (retry == 1);

        scanner.close();
    }
}