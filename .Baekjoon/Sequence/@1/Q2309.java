package project;

import java.util.ArrayList;
import java.util.Scanner;

public class Q2309 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> height = new ArrayList<Integer>();
        int tot = 0;
        int num;
        int i, j = 0;

        for (i = 0; i < 9; i++) {
            height.add(scanner.nextInt());
            tot += height.get(i);
        }
        num = tot - 100;

        Loop1: for (i = 0; i < 9; i++) {
            for (j = i + 1; j < 9; j++) {
                if (height.get(i) + height.get(j) == num)
                    break Loop1;
            }
        }
        if (i > j) {
            height.remove(j);
            height.remove(i - 1);
        } else {
            height.remove(i);
            height.remove(j - 1);
        }

        for (i = 0; i < height.size(); i++) {
            for (j = 0; j < height.size() - i - 1; j++) {
                if (height.get(j) > height.get(j + 1)) {
                    int temp = height.get(j);
                    height.set(j, height.get(j + 1));
                    height.set(j + 1, temp);
                }
            }
        }

        for (int x : height)
            System.out.println(x);
        scanner.close();
    }
}
