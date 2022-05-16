package project;

import java.util.ArrayList;
import java.util.Scanner;

public class Q9375 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();

        for (int i = 0; i < testCase; i++) {
            int n = scanner.nextInt();
            ArrayList<String> clothes = new ArrayList<String>();
            int res = 1;

            for (int k = 0; k < n; k++) {
                scanner.next();
                String input = scanner.next();

                int j = clothes.indexOf(input);
                if (j != -1) {
                    clothes.set(j + 1, (Integer.parseInt(clothes.get(j + 1)) + 1) + "");
                } else {
                    clothes.add(input);
                    clothes.add("1");
                }
            }

            for (int m = 1; m < clothes.size(); m += 2) {
                res *= (Integer.parseInt(clothes.get(m)) + 1);
            }

            System.out.println(res - 1);
        }

        scanner.close();
    }
}
