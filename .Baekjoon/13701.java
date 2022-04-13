//13701
package project;

import java.util.Scanner;

public class Main {
    static String solution(String input){
        String ans = "";
        int num=0;

        while((num=input.indexOf(" "))!=-1){
            String temp = input.substring(0, num);
            ans+=temp;
            ans+=" ";
            input=input.substring(num+1);
            input=input.replace(temp+" ", "");
        }
        ans+=input;

        return ans;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(solution(scanner.nextLine()));
        scanner.close();
    }
}
