package project;

import java.util.Scanner;

public class Q9 {
    static int sumof(int a, int b){
        int sum=0;

        for(int i=a;i<=b;i++){
            sum+=i;
        }

        return sum;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(sumof(scanner.nextInt(), scanner.nextInt()));
        scanner.close();
    }
}
