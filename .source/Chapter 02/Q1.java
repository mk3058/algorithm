package project;

import java.util.Random;

public class Q1 {
    static int maxOf(int[] a){
        int max=Integer.MIN_VALUE;

        for(int x : a){
            if(x>max) max=x;
        }
        return max;
    }
    public static void main(String[] args){
        Random rand = new Random();
        int[] height = new int[rand.nextInt(11)];

        for(int i=0;i<height.length;i++){
            height[i]=100+rand.nextInt(80);
        }

        System.out.println(maxOf(height));
    }
}
