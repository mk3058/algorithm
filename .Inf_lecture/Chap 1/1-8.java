package project;

import java.util.Scanner;

public class Main {
    static boolean solution(String input){
        /* input=input.toUpperCase();
        int lt=0;
        int rt=input.length()-1;
        
        while(lt<rt){
            if(!(Character.isAlphabetic(input.charAt(lt)))){
                lt++;
                continue;
            }
            if(!(Character.isAlphabetic(input.charAt(rt)))){
                rt--;
                continue;
            }
            if(input.charAt(lt)!=input.charAt(rt)){
                return false;
            }
            lt++;
            rt--;
        }

        return true; */

        input=input.toUpperCase().replaceAll("[^A-Z]", "");
        int lt=0, rt=input.length()-1;

        while(lt<rt){
            if(input.charAt(lt)!=input.charAt(rt)) return false;
            lt++;
            rt--;
        }

        return true;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        if(solution(scanner.nextLine())==true) System.out.println("YES");
        else System.out.println("NO");

        scanner.close();
    }
}
