package project;

import java.util.Scanner;

public class Main {
    public static void solution(int[][] gameInfo) {
        for (int i = 0; i < gameInfo[0].length; i++) {
            if (gameInfo[0][i] == 1) // 가위
                System.out.println(gameInfo[1][i] == 2 ? 'B' : gameInfo[1][i] == 1 ? 'D' : 'A');
            if (gameInfo[0][i] == 2) // 바위
                System.out.println(gameInfo[1][i] == 3 ? 'B' : gameInfo[1][i] == 2 ? 'D' : 'A');
            if (gameInfo[0][i] == 3) // 보
                System.out.println(gameInfo[1][i] == 1 ? 'B' : gameInfo[1][i] == 3 ? 'D' : 'A');
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] game = new int[2][scanner.nextInt()]; // 1행 A 2행 B

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < game[0].length; j++) {
                game[i][j] = scanner.nextInt();
            }
        }

        solution(game);
        scanner.close();
    }
}
