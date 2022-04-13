package project;

public class Main {
    static int med3(int a, int b, int c){
        if(a>=b){
            if(b>=c) return b;
            else if(a>=c) return c;
            else return a;
        }
        else if(a>c) return a;
        else if(b>c) return c;
        else return b;
    }

    public static void main(String[] args){
        System.out.println(med3(1,2,3));
    }
}
