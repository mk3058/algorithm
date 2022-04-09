//1259
package project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while(true){
            String input = scanner.nextLine();
            if(input.equals("0")) break;
            if(check_num(input)==0) System.out.println("yes");
            else System.out.println("no");
        }

        scanner.close();
    }

    static int check_num(String num){
        int i=0;
        int length = num.length();

        for(i=0;i<length/2;i++){
            if(num.charAt(i)!=num.charAt(length-1-i)){
                return 1;
            }
        }

        return 0;
    }
}
