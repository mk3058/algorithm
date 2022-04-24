package project;

import java.util.Scanner;

public class Main {
    static int solution(String input){
        String res="";
        //1
        /*int i=0;    

            for(i=0;i<input.length();i++){
            if(Character.isDigit(input.charAt(i))) res+=input.charAt(i);
        } */

        //2
        /* for(char x : input.toCharArray()){
            if('0'<=x&&x<='9') res+=x;
        }
        
        return Integer.parseInt(res); */

        //3
        int ans=0;
        for(char x:input.toCharArray()){
            if('0'<=x&&x<='9') ans=ans*10+((int)x-48);
        }

        return ans;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println(solution(scanner.next()));
        scanner.close();
    }
}
