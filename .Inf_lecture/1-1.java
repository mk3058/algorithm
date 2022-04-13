//1-1
package project;

import java.util.Scanner;

public class Main {

    public int soultion(String str, char c){
        int cnt=0;
        int i=0;
        
        /*for(i=0;i<str.length();i++){
            if(str.charAt(i)==c) cnt++;
            else if(str.charAt(i)-c==32) cnt++;
            else if(str.charAt(i)-c==-32) cnt++;
        }*/

        /*str.toUpperCase();
        Character.toUpperCase(c);
        for(i=0;i<str.length();i++){
            if(str.charAt(i)==c) cnt++;
        }*/

        for(char k:str.toCharArray()){
            if(k==c) cnt++;
        }
        
        return cnt;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Main main = new Main();

        String input = scanner.nextLine();
        char ch = scanner.next().charAt(0);
        

        System.out.println(main.soultion(input, ch));
        scanner.close();
    }
}
