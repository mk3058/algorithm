package project;

import java.util.Scanner;
import java.util.ArrayList;

public class Q1940 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> input = new ArrayList<Integer>();

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            int temp = scanner.nextInt();
            if (temp < M)
                input.add(temp);
        }

        while (input.size() > 0) {
            int temp = input.get(0);
            input.remove(0);
            if (input.indexOf((M - temp)) != -1) {
                cnt++;
                input.remove(input.indexOf((M - temp)));
            }
        }

        System.out.println(cnt);
        scanner.close();
    }
}
