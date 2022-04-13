package project;

import java.util.Scanner;

public class Main {
    public String solution(String input){
        String ans="";
        int lt=0;
        int rt=input.length()-1;
        char[] temp = input.toCharArray();

        while(rt>lt){
            char tmp;

            if(!Character.isAlphabetic(temp[lt]))
            lt++;
            else if(!Character.isAlphabetic(temp[rt]))
            rt--;
            else{
                tmp=temp[lt];
                temp[lt]=temp[rt];
                temp[rt]=tmp;
                lt++;
                rt--;
            }
        }
        ans=String.valueOf(temp);
        return (ans);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Main main = new Main();

        System.out.printf("%s", main.solution(scanner.nextLine()));
        scanner.close();
    }
}

/* package project;

import java.util.Scanner;

public class Main {
    public void solution(String str){
        String ans = "";
        char[] alp = new char[100];
        int cnt=0;

        for(char x : str.toCharArray()){
            if(('a'<=x&&x<='z')||('A'<=x&&x<='Z')){
                alp[cnt]=x;
                cnt++;
            }
        }
        cnt--;

        for(char x : str.toCharArray()){
            if(('a'<=x&&x<='z')||('A'<=x&&x<='Z')){
                ans+=alp[cnt];
                cnt--;
            }
            else{
                ans+=x;
            }

        }

        System.out.println(ans);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Main main = new Main();

        main.solution(scanner.next());
        scanner.close();
    }
} */