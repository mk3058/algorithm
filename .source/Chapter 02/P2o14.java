package project;

import java.util.Scanner;

public class P2o14 {
    static final int VMAX = 21; // 시력 분포 0.0에서 0.1 단위로 21개

    public class physcData {
        String name;
        int age;
        double vision;

        public physcData(String name, int age, double vision) {
            this.name = name;
            this.age = age;
            this.vision = vision;
        }
    }

    static double aveAge(physcData[] x) {
        int tot = 0;

        for (int i = 0; i < x.length; i++) {
            tot += x[i].age;
        }

        return ((double) tot / x.length);
    }

    static void distVision(physcData[] x, int[] vdist) {
        for (int i = 0; i < x.length; i++) {
            vdist[(int) (x[i].vision * 10)]++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        P2o14 m = new P2o14();

        P2o14.physcData[] x = {
                m.new physcData("김민규", 23, 1.0),
                m.new physcData("김민규", 23, 1.0),
                m.new physcData("김민규", 23, 1.0),
                m.new physcData("김민규", 23, 1.0)
        };
        int[] vision = new int[VMAX];

        System.out.println("*신체검사 리스트*");
        System.out.println("이름    나이  시력");
        System.out.println("-------------------");
        for (int i = 0; i < x.length; i++) {
            System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].age, x[i].vision);
        }

        System.out.printf("\n평균 나이 : %5.1f\n", aveAge(x));

        distVision(x, vision);

        System.out.println("시력 분포");
        for (int i = 0; i < VMAX; i++) {
            System.out.printf("%3.1f~ : %2d명\n", i / 10.0, vision[i]);
        }

        scanner.close();
    }
}