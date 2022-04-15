package project;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int sum=0;
        int i=1;
        int n=scanner.nextInt();

        while(i<=n){
            sum+=n;
            i++;
        }

        System.out.println("i : "+i);
        scanner.close();
    }
}
