package project;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int sum=0;
        int n=scanner.nextInt();

        for(int i=1;i<=n;i++){
            if(i<n) System.out.print(i+" + ");
            else System.out.print(i+" = ");

            sum+=i;
        }
        System.out.println(sum);
        scanner.close();
    }
}
