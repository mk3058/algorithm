package project;

import java.util.Scanner;

public class Main {
    static String solution(int size, String input){
        String ans = "";
        int i=0;
        input=input.replace('#', '1').replace('*', '0');

        for(i=0;i<size;i++){
            String temp= input.substring(7*i,7*i+7);
            
            int num = Integer.parseInt(temp);
            int decimal=0, cnt=0;
            while(num>=1){
                decimal+=num%10*Math.pow(2, cnt);
                num/=10;
                cnt++;
            }

            ans+=(char)decimal;
            cnt=0;
        }
   
        return ans;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println(solution(Integer.parseInt(sc.nextLine()), sc.nextLine()));
        sc.close();
    }
}
