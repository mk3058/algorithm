package project;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int cnt=1;
        int num=scanner.nextInt();

        while(num/10>=1){
            cnt++;
            num=num/10;
        }

        System.out.println("그 수는 "+cnt+"자리 입니다");
        scanner.close();
    }
}
