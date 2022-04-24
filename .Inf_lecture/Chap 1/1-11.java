package project;

import java.util.Scanner;

public class Main {
    static String solution(String input){
        String ans = "";
        int cnt=1;
        int i, j;

        for(i=0;i<input.length();i++){
            for(j=i+1;j<input.length();j++){
                if(input.charAt(i)!=input.charAt(j)){
                    ans+=input.charAt(i);
                    
                    i=j-1;
                    break;
                }
                cnt++;
            }
            i=j-1;
            if(i==input.length()-1) ans+=input.charAt(i);
            if(cnt>1) ans+=cnt;
            cnt=1;
        }

        return ans;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println(solution(scanner.next()));
        scanner.close();
    }
}
