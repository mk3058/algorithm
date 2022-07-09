package project;

import java.util.Scanner;

public class Solution {
    static int numberOfTestCase;
    static int[][] map; // 0 물에 잠기지 않은 부분, 1 물에 잠긴 부분, 2 이미 방문한 영역
    static int sideLength;
    static boolean[][] visited;
    static int[] dr = { -1, 1, 0, 0 };
    static int[] dc = { 0, 0, -1, 1 };
    static int areaCount; // 영역의 개수

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        numberOfTestCase = scanner.nextInt();

        for (int caseNum = 0; caseNum < numberOfTestCase; caseNum++) {
            sideLength = scanner.nextInt(); // 삼성국 한 변의 길이
            int[][] heightOfSamsung = new int[sideLength][sideLength]; // 삼성국 지면의 높이
            int max = 1; // 최대 영역의 개수
            int years = 1; // 흐른 시간
            map = new int[sideLength][sideLength];
            visited = new boolean[sideLength][sideLength];

            for (int i = 0; i < sideLength; i++) {
                for (int j = 0; j < sideLength; j++) {
                    heightOfSamsung[i][j] = scanner.nextInt();
                }
            } // 삼성국 지면 높이 입력

            do {
                for (int i = 0; i < sideLength; i++) {
                    for (int j = 0; j < sideLength; j++) {
                        if (heightOfSamsung[i][j] <= years) {
                            map[i][j] = 1;
                        } else
                            map[i][j] = 0;
                    }
                } // 물에 잠긴 영역 표시

                areaCount = 0;
                for (int i = 0; i < sideLength; i++) {
                    for (int j = 0; j < sideLength; j++) {
                        if (map[i][j] == 0) {
                            dfs(i, j);
                            areaCount++;
                        }
                        if (areaCount > max)
                            max = areaCount;
                    }
                }
                years++;
            } while (areaCount > 0);
            System.out.println("#" + (caseNum + 1) + " " + max);
        }

        scanner.close();
    }

    public static void dfs(int r, int c) {
        map[r][c] = 2;

        for (int i = 0; i < 4; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];

            if (nr >= 0 && nc >= 0 && nr < sideLength && nc < sideLength) {
                if (map[nr][nc] == 0)
                    dfs(nr, nc);
            }
        }
    }
}
