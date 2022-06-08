package project;

public class P2o10 {
    public static void main(String[] args) {
        int counter = 0;
        int ptr = 0; // 찾은 소수의 개수
        int[] prime = new int[500];

        prime[ptr++] = 2;
        for (int n = 3; n < 1000; n += 2) {
            boolean checker = true;
            for (int i = 1; i < ptr; i++) {
                counter++;
                if (n % prime[i] == 0) {
                    checker = false;
                    break;
                }
            }

            if (checker) {
                prime[ptr++] = n;
                System.out.println(n);
            }
        }

        System.out.println("나눗셈을 수행한 횟수 : " + counter);
    }
}
