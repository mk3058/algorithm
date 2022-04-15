package project;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n=scanner.nextInt();
        int sum=0;

        sum=(n+1)*n/2;

        System.out.println(sum);
        scanner.close();
    }
}
