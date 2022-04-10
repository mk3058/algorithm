package project;

import java.util.Scanner;

public class Main {
    public void solution(String str){
        int i;
        int index=0, length=0;
        String res="";

        for(i=0;i<str.length();i++){
            int temp=0;
            if(str.charAt(i)==' '){
                if(i-temp>index){
                    index=i;
                    length=i-temp;
                }
                temp=i;
            }
        }

        for(i=(index-length+1);i<index;i++){
            res+=str.charAt(i);
        }

        System.out.print(res);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Main main = new Main();
        
        String input = scanner.nextLine();
        main.solution(input);

        scanner.close();
    }
}