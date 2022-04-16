package project;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num=scanner.nextInt();

        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
