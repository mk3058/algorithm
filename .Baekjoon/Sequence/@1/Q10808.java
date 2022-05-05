package project;

import java.util.ArrayList;
import java.util.Scanner;

public class Q10808 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> input = new ArrayList<Character>();
        int[] alp_cnt = new int[26];
        String temp = scanner.next();

        for (char x : temp.toCharArray()) {
            input.add(x);
        }

        for (int i = 0; i < 26; i++) {
            if (input.isEmpty() == true)
                break;
            for (int j = 0; j < input.size(); j++) {
                if (input.get(j) == (char) (i + 'a')) {
                    alp_cnt[i]++;
                    input.remove(j);
                    j--;
                }
            }
        }

        for (int n : alp_cnt)
            System.out.printf("%d ", n);
        scanner.close();
    }
}
