package project;

import java.util.Scanner;

public class Main {
    static int solution(int[] input, int size) {
        int max = 0;
        int cnt = 0;

        for(int n:input){
            if(max<n){
                max=n;
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int[] input = new int[n];

        for(int i=0;i<n;i++){
            input[i]=scanner.nextInt();
        }

        System.out.println(solution(input, n));
        scanner.close();
    }
}
