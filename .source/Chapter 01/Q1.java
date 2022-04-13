package project;

public class Main {
    static int max4(int a, int b, int c, int d){
        int max=0;

        if(a>max) max=a;
        if(b>max) max=b;
        if(c>max) max=c;
        if(d>max) max=d;

        return max;
    }
    public static void main(String[] args){
        System.out.println(max4(1,4,3,2));
    }
}
