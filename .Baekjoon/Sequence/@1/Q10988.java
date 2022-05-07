package project;

import java.util.Scanner;

public class Q10988 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int lt = 0;
        int rt = input.length() - 1;

        while (lt < rt) {
            if (input.charAt(lt) != input.charAt(rt)) {
                System.out.println("0");
                System.exit(0);
            }
            lt++;
            rt--;
        }
        System.out.println("1");
        scanner.close();
    }
}
