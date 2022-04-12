//baekjoon 1037
package project;

import java.util.Scanner;

public class Main {
    public long solution(int[] num, int size){
        int divisor_max = 0;
        long original_num=0;
        int mul=2;
        int i=0;
        
        for(i=0;i<size;i++){
            if(divisor_max<num[i]) divisor_max=num[i];
        }

        Loop1 : while(true){
            original_num = divisor_max*mul;
            mul++;
            Loop2 : for(i=0;i<size;i++){
                int temp_mul=2;
                while(true){
                    if(original_num==num[i]*temp_mul) continue Loop2;
                    else if(original_num>num[i]*temp_mul) temp_mul++;
                    else continue Loop1;
                }
            }

            break;
        }

        return original_num;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Main main = new Main();
        int num = scanner.nextInt();
        int[] divisor = new int[num];

        for(int i=0;i<num;i++){
            divisor[i] = scanner.nextInt();
        }

        System.out.println(main.solution(divisor, num));
        scanner.close();
    }
}
