package project;

import java.util.Scanner;

public class Main {
    public int[] solution(int size, int[][] score) {
        int[] rank = new int[size];

        sort(size, score);
        int tmpScore = -1;
        int tmpRank = 0;
        for (int i = 0; i < size; i++) {
            if (tmpScore == score[0][size - 1 - i]) {
                rank[score[1][size - 1 - i]] = tmpRank;
            } else {
                rank[score[1][size - 1 - i]] = tmpRank = i + 1;
                tmpScore = score[0][size - 1 - i];
            }
        }

        return rank;
    }

    public void sort(int size, int[][] before) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (before[0][j] > before[0][j + 1]) {
                    int temp = before[0][j];
                    before[0][j] = before[0][j + 1];
                    before[0][j + 1] = temp;

                    temp = before[1][j];
                    before[1][j] = before[1][j + 1];
                    before[1][j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main m = new Main();
        int size = scanner.nextInt();
        int[][] score = new int[2][size];

        for (int i = 0; i < size; i++) {
            score[0][i] = scanner.nextInt();
            score[1][i] = i;
        }

        for (int x : m.solution(size, score))
            System.out.print(x + " ");

        scanner.close();
    }
}
