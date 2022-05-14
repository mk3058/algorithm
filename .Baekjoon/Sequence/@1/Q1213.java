package project;

import java.util.Scanner;
import java.util.ArrayList;

public class Q1213 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Character> input = new ArrayList<Character>();
        int[] cnt = new int[26];
        int size = input.size();
        StringBuffer ans = new StringBuffer();
        int odd_index = -1;

        for (char x : scanner.next().toCharArray()) {
            input.add(x);
        }

        while (input.size() > 0) {
            cnt[(int) (input.get(0)) - 65]++;
            input.remove(0);
        }

        for (int i = 0; i < 26; i++) {
            if (cnt[i] % 2 != 0) {
                if (size % 2 != 0 || odd_index != -1) {
                    System.out.println("I'm Sorry Hansoo");
                    System.exit(0);
                }
                odd_index = i;
                cnt[i]--;
            }
            while (cnt[i] > 0) {
                ans.insert(ans.length() / 2, (char) (i + 65));
                cnt[i]--;
            }
        }

        if (odd_index != -1) {
            ans.insert(ans.length() / 2, (char) (odd_index + 65));
        }

        System.out.println(ans.toString());
        scanner.close();
    }
}
