package project;

import java.util.Scanner;

public class Main {
    public void solution(String str){
        /* String ans = "";
        String[] words = str.split(" ");
        int max_len = Integer.MIN_VALUE;

        for(String x : words){
            if(x.length()>max_len){
                max_len = x.length();
                ans=x;
            }
        }

        System.out.println(ans); */

        String ans = "";
        int max_len = Integer.MIN_VALUE, pos;

        while((pos=str.indexOf(' '))!=-1){
            String temp = str.substring(0, pos);
            if(temp.length()>max_len){
                ans=temp;
                max_len=temp.length();
            }

            str=str.substring(pos+1);
        }
        if(str.length()>max_len) ans=str;

        System.out.println(ans);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Main main = new Main();
        
        String input = scanner.nextLine();
        main.solution(input);

        scanner.close();
    }
}