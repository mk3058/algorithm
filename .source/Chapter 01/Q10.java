package project;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int a=0, b=1;

        System.out.print("a 의 값 : ");
        a=scanner.nextInt();
        System.out.print("b 의 값 : ");
        b=scanner.nextInt();
        while(a>=b){
            if(a>=b) System.out.println("a보다 큰 값을 입력하세요");
            System.out.print("b 의 값 : ");
            b=scanner.nextInt();
        }

        System.out.println("b-a는 "+(b-a)+" 입니다");
        scanner.close();
    }
}
