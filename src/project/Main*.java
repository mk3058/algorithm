package project;

import java.util.Scanner;

public class Main {
    static String solution(String input) {
        int cnt = 0;
        int i, j;
        String ans = "";

        for (i = 0; i < input.length(); i++) {
            if (i == input.indexOf(input.charAt(i))) { 
                ans += input.charAt(i);
                for (j = i; j < input.length(); j++) {
                    if (input.charAt(i) != input.charAt(j)){
                        input=input.substring(j);
                        System.out.println(input);
                        break;
                    }
                    else
                        cnt++;
                }
            }

            if (cnt > 1)
                ans += cnt;
            cnt = 0;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(solution(scanner.next()));
        scanner.close();
    }
}
