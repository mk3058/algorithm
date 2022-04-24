package project;

import java.util.Scanner;

public class Main {
    static String solution(String input){
        input+=' ';

        int cnt=1;
        String ans = "";

        for(int i=0;i<input.length()-1;i++){
            if(input.charAt(i)==input.charAt(i+1)) cnt++;
            else{
                ans+=input.charAt(i);
                if(cnt>1) ans+=cnt;
                
                cnt=1;
            }
        }
        
        return ans;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println(solution(scanner.next()));
        scanner.close();
    }
}
