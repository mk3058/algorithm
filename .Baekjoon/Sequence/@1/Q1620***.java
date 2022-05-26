package project;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1620 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 수록된 이름의 개수
        int M = scanner.nextInt(); // 문제의 개수
        ArrayList<String> name = new ArrayList<String>();
        ArrayList<String> sorted_name_alp = new ArrayList<String>();
        String[] sorted_name_num = new String[N];

        for (int i = 0; i < N; i++) {
            sorted_name_num[i] = scanner.next();
            name.add((i + 1) + "");
            name.add(sorted_name_num[i]);
        }

        String tmp = "";
        int ind = 0;
        for (int i = 0; i < N; i++) {
            tmp = name.get(1);
            ind = 1;
            for (int j = 3; j < name.size(); j += 2) {
                if (tmp.compareTo(name.get(j)) > 0) {
                    tmp = name.get(j);
                    ind = j;
                }
            }
            sorted_name_alp.add(name.get(ind - 1));
            sorted_name_alp.add(tmp);
            name.remove(ind - 1);
            name.remove(ind - 1);

        }

        System.out.println(sorted_name_alp);
        for (int i = 0; i < M; i++) {
            String temp = scanner.next();
            int index;

            if (Character.isAlphabetic(temp.charAt(0))) {
                while (true) {
                    index = sorted_name_alp.size() / 2;
                    if (temp.compareTo(sorted_name_alp.get(index)) > 0) {
                        sorted_name_alp.subList(index + 1, sorted_name_alp.size());
                        if (sorted_name_alp.size() == 1)
                            index = 1;
                        System.out.println("DEBUG UP  " + temp.compareTo(sorted_name_alp.get(index)));
                    } else if (temp.compareTo(sorted_name_alp.get(index)) < 0) {
                        sorted_name_alp.subList(0, index);
                        if (sorted_name_alp.size() == 1)
                            index = 1;
                       System.out.println("DEBUG LOW  " + temp.compareTo(sorted_name_alp.get(index)));
                    } else {
                        System.out.println(index + 1);
                        break;
                    }
                }
            } else {
                System.out.println(sorted_name_num[Integer.parseInt(temp) - 1]);
            }

        }

        scanner.close();
    }
}