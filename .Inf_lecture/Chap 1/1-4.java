package project;

import java.util.Scanner;

public class Main {
    public void solution(String str){
        String ans = "";
        int i;

        for(i=str.length()-1;i>=0;i--){
            ans+=str.charAt(i);
        }

        System.out.println(ans);
    }
    

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Main main = new Main();

        int num = scanner.nextInt();
        int i=0;

        for(i=0;i<num;i++){
            main.solution(scanner.next());
        }

        scanner.close();
    }
}
