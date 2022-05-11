package project;

import java.util.Scanner;

public class Q1620 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        String[] name=new String[n];

        for(int i=0;i<n;i++){
            name[i]=scanner.next();
        }

        for(int i=0;i<m;i++){
            String input=scanner.next();
            if(Double.isNaN(Integer.parseInt(input))){
                for(String s:name){
                    if(s.equalsIgnoreCase(input)) System.out.println(s);
                }
            }
            else{
                System.out.println(name[Integer.parseInt(input)+1]);
            }
        }

        scanner.close();
    }
}
