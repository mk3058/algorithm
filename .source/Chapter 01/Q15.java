package project;

import java.util.Scanner;

public class Q15 {
    static void triangleLB(int n){
        int i, j;

        for(i=0;i<n;i++){
            for(j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleRU(int n){
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleRB(int n){
        for(int i=1;i<=n;i++){
            for(int j=0;j<n-i;j++) System.out.print(" ");
            for(int k=1;k<=i;k++) System.out.print("*");
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        triangleLB(scanner.nextInt());
        triangleRU(scanner.nextInt());
        triangleRB(scanner.nextInt());

        scanner.close();
    }
}
