//1-2
package project;

import java.util.Scanner;

public class Main {

    public void soultion(String str){
        String ans = "";

        /* for(char ch:str.toCharArray()){
            if(Character.isLowerCase(ch)) ans+=Character.toUpperCase(ch);
            else ans+=Character.toLowerCase(ch);
        } */

        for(char ch : str.toCharArray()){
            if('a'<=ch&&ch<='z') ans+=(char)(ch-32);
            else ans+=(char)(ch+32);
        }

        System.out.println(ans);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Main main = new Main();

        String input = scanner.next();

        main.soultion(input);
        scanner.close();
    }
}
