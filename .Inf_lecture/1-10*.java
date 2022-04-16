package project;

import java.util.Scanner;

public class Main {
    static String solution(String input, char ch){
        String index = "";
        String ans="";
        int i, j;

        while(input.indexOf(ch)!=-1){
            index+=input.indexOf(ch);
            input.replace(ch, ' ');
        }

        if(index.length()!=1){
            int index1=0, index2=0;
            for(i=0;i<index.length();i++){
                index1=index2;
                index2=index.charAt(i);
                //????
            }
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println(solution(scanner.next(), scanner.nextLine().charAt(0)));
        scanner.close();
    }
}
