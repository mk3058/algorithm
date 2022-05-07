package project;

import java.util.Scanner;

public class Q9996 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String name;
        String pattern = scanner.next();
        int chk = 0;
        int lt, rt;
        int rt_name;

        for (int i = 0; i < num; i++) {
            name = scanner.next().toLowerCase();
            lt = 0;
            rt=pattern.length() - 1;
            rt_name=name.length() - 1;

            while (pattern.charAt(lt) != '*') {
                if (pattern.charAt(lt) != name.charAt(lt)) {
                    System.out.println("NE");
                    chk = 1;
                    break;
                }
                lt++;
            }
            while (chk == 0 && pattern.charAt(rt) != '*') {
                if (pattern.charAt(rt) != name.charAt(rt_name)) {
                    System.out.println("NE");
                    chk = 1;
                    break;
                }
                rt--;
                rt_name--;
            }

            if (chk == 0)
                System.out.println("DA");
            else
                chk = 0;
        }

        scanner.close();
    }
}
