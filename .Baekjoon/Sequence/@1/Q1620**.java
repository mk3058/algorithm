package project;

import java.util.Scanner;

public class Q1620 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input="";

        int N=scanner.nextInt(); //수록된 이름의 개수
        int M=scanner.nextInt(); //문제의 개수
        
        for(int i=0;i<N;i++){
            input+=(i+1);
            input+=scanner.next();
        }

        for(int i=0;i<M;i++){
            String temp=scanner.next();
            int index;

            if(Character.isAlphabetic(temp.charAt(0))){
                index=input.indexOf(temp)-1;
                while(true){
                    if(Character.isAlphabetic(input.charAt(index))) break;
                    index--;
                }
                System.out.println(input.substring(index+1, input.indexOf(temp)));
            }
            else{
                index=input.indexOf(temp)+temp.length();
                while(true){
                    if(Character.isDigit(input.charAt(index))) break;
                    index++;
                }
                System.out.println(input.substring(input.indexOf(temp)+temp.length(), index));
            }
        }

        scanner.close();
    }
}
