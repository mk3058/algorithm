package project;

import java.util.Scanner;

public class Main {
    static boolean solution(String input){
        /*input=input.toUpperCase();
        int lt=0, rt=input.length()-1;

        while(lt<rt){
            if(input.charAt(lt)!=input.charAt(rt)) return false;
            lt++;
            rt--;
        }

        return true; */

        String inputReverse = new StringBuilder(input).reverse().toString();
        
        if(input.equalsIgnoreCase(inputReverse)) return true;
        else return false;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        if(solution(scanner.next())==true) System.out.println("YES");
        else System.out.println("NO");

        scanner.close();
    }
}
