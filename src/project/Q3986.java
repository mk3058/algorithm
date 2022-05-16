package project;

import java.util.Scanner;

public class Q3986 {
    static boolean checkWord(String input) {
        int lt = 0;
        int rt = input.length() - 1;
        if (rt % 2 == 0)
            return false;

        boolean chk = true;
        while (lt < rt) {
            int lt_temp, rt_temp;
            while (true) {
                if (input.charAt(lt) == input.charAt(rt)) {
                    lt_temp = lt;
                    rt_temp = rt;
                    break;
                }
                rt--;
            }

            if (lt_temp >= rt_temp)
                return false;

            while (lt_temp < rt_temp) {
                if (input.charAt(lt_temp) != input.charAt(rt_temp)) {
                    chk = false;
                    break;
                }
                lt_temp++;
                rt_temp--;
                if (lt_temp == rt_temp) {
                    return false;
                }
                chk = true;
            }
            if (chk == true) {
                lt = rt + 1;
                rt = input.length() - 1;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int cnt = 0;

        for (int i = 0; i < num; i++) {
            if (checkWord(scanner.next()) == true)
                cnt++;
        }

        System.out.println(cnt);
        scanner.close();
    }
}
