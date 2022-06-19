package project;

import java.util.Scanner;

public class Main {
    public int[] solution(int input) {
        int[] fibonacci = new int[input];
        fibonacci[0] = fibonacci[1] = 1;

        for (int i = 2; i < input; i++) {
            fibonacci[i] = fibonacci[i - 2] + fibonacci[i - 1];
        }

        return fibonacci;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main m = new Main();

        for(int x:m.solution(scanner.nextInt())){
            System.out.print(x+" ");
        }

        scanner.close();
    }
}
