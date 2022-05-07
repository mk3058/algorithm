package project;

import java.util.Scanner;
import java.util.ArrayList;

public class Q1159 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> name = new ArrayList<String>();
        int num = scanner.nextInt();
        int chk = 0;
        int i = 0, j = 0;

        for (i = 0; i < num; i++) {
            name.add(scanner.next());
        }

        for (i = 0; i < 26; i++) {
            int cnt = 0;
            for (j = 0; j < name.size(); j++) {
                if (name.get(j).charAt(0) == (char) ('a' + i)) {
                    cnt++;
                    name.remove(j);
                    j--;
                }
            }

            if (cnt >= 5) {
                System.out.printf("%c", (char) ('a' + i));
                chk = 1;
            }
        }

        if (chk == 0)
            System.out.println("PREDAJA");
        scanner.close();
    }
}
