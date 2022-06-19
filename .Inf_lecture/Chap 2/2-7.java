package project;

import java.util.Scanner;

public class Main {
    public int solution(int[] result) {
        int tot_score=0;
        int acc = 1;

        for (int x : result) {
            if (x == 1) {
                tot_score += (acc++);
            } else {
                acc = 1;
            }
        }
        
        return tot_score;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main m = new Main();
        int size = scanner.nextInt();
        int[] result = new int[size];

        for (int i = 0; i < size; i++) {
            result[i] = scanner.nextInt();
        }

        System.out.println(m.solution(result));
        scanner.close();
    }
}
