package project;

import java.util.Scanner;

public class Main {
    static String solution(int[] input, int size){
        String ans =""+input[0]+" ";

        for(int i=1;i<size;i++){
            if(input[i-1]<input[i]){
                ans+=input[i];
                ans+=' ';
            }
        }

        return ans;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int n=scanner.nextInt();
        int[] input = new int[n];

        for(int i=0;i<n;i++){
            input[i]=scanner.nextInt();
        }

        System.out.println(solution(input, n));
        scanner.close();
    }
}
