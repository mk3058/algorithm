package project;

import java.util.Scanner;

public class Main {
    public static void solution(int input) {
        int[] prime = new int[input / 2];
        int indexOfPrime = 2;
        prime[0] = 2;
        prime[1] = 3;

        for (int i = 5; i <= input; i += 2) {
            int j = 1;
            boolean flag = true;
            while (j < indexOfPrime) {
                if (i % prime[j] == 0) {
                    flag = false;
                    break;
                }
                if (prime[j] > Math.sqrt(input)) {
                    break;
                }
                j++;
            }

            if (flag)
                prime[indexOfPrime++] = i;
        }
        System.out.println(indexOfPrime);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        solution(scanner.nextInt());
        scanner.close();
    }
}
