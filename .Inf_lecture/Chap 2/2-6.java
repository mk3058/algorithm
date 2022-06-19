package project;

import java.util.Scanner;

public class Main {
    public void solution(int size, int[] input) {
        int[] primeNum = new int[size];
        int index = 0;
        
        for (int i = 0; i < size; i++) {
            StringBuffer tmp = new StringBuffer();
            tmp.append(input[i]);
            int reversedNum = Integer.parseInt(tmp.reverse().toString());
            if (isPrime(reversedNum))
                primeNum[index++] = reversedNum;
        }
        
        for (int i = 0; i < index; i++) {
            System.out.print(primeNum[i]+" ");
        }
    }
    
    public boolean isPrime(int i) {
        if (i == 2)
            return true;
        else if(i<2 || i%2==0) 
            return false;
        
        
        for (int j = 3; j <= Math.sqrt(i); j += 2) {
            if (i % j == 0) {
                return false;
            }
        }
       
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main m = new Main();

        int size = scanner.nextInt();
        int[] input = new int[size];

        for (int i = 0; i < size; i++) {
            input[i] = scanner.nextInt();
        }

        m.solution(size, input);
        scanner.close();
    }
}
