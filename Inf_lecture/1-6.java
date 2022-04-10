package project;

import java.util.Scanner;

public class Main {
    public void solution(String str){
        String ans = "";
        char[] input = str.toCharArray();
        int i, j;

        for(i=0;i<str.length();i++){
            if(input[i]=='0') continue;
            for(j=i+1;j<str.length();j++){
                if(input[i]==input[j]) input[j]='0';
            }
        }
        for(i=0;i<input.length;i++){
            if(input[i]!='0') ans+=input[i];
        }

        System.out.println(ans);
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Main main = new Main();

        main.solution(scanner.next());

        scanner.close();
    }
}
