package project;

import java.util.Scanner;

public class Main {
    static int[] solution(String input, char ch) {
        /*
         * String ans = "";
         * String temp=input;
         * int index1=temp.indexOf(ch);
         * temp=temp.substring(index1+1);
         * int index2=temp.indexOf(ch);
         * temp=temp.substring(index2+1);
         * int i;
         * 
         * if(index2==-1){
         * for(i=0;i<input.length();i++){
         * if(i<=index1){
         * ans+=(index1-i);
         * ans+=' ';
         * }
         * else{
         * ans+=(i-index1);
         * ans+=' ';
         * }
         * }
         * }
         * else{
         * for(i=0;i<input.length();i++){
         * if(i<=index1){
         * ans+=(index1-i);
         * ans+=' ';
         * }
         * else if(i<index1+(index1+index2)/2){
         * ans+=(i-index1);
         * ans+=' ';
         * }
         * else if(index1+(index1+index2)/2<i){
         * ans+=(index2-i);
         * ans+=' ';
         * }
         * }
         * }
         */

        char[] temp = input.toCharArray();
        int[] ans = new int[input.length()];
        int cnt = 1000;
        int i;

        for (i = 0; i < temp.length; i++) {
            if (temp[i] == ch)
                cnt = 0;
            ans[i] = cnt;
            cnt++;
        }

        cnt=1000;
        for (i = temp.length - 1; i >= 0; i--) {
            if (temp[i] == ch)
                cnt = 0;
            if (ans[i] > cnt)
                ans[i] = cnt;
            cnt++;
        }

        return ans;
    }

    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        int[] ans = solution(scanner.next(), scanner.next().charAt(0));

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]);
            System.out.print(" ");
        }

        scanner.close();
    }
}
