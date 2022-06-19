package project;

public class P2o9 {
    public static void main(String[] args) {
        int counter = 0;

        for (int n = 2; n <= 1000; n++) {
            int i = 0;
            boolean checker = true;

            for (i = 2; i <= (int) Math.sqrt(n); i++) {
                counter++;
                if (n % i == 0) {
                    checker = false;
                    break;
                }
            }
            if (checker)
                System.out.println(n);
        }

        System.out.println("나눗셈을 수행한 횟수 : " + counter);
    }
}
