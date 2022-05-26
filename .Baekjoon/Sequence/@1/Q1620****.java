package project;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> input = new ArrayList<>(); // 입력
        int N = scanner.nextInt(); // 수록된 이름의 개수
        int M = scanner.nextInt(); // 문제의 개수
        ArrayList<String> name_alp = new ArrayList<>(); // 사전순 정렬
        ArrayList<String> name_num = new ArrayList<>(); // 번호순 정렬

        for (int i = 0; i < N; i++) { // 이름 입력
            name_num.add(scanner.next());
            input.add((i + 1) + "");
            input.add(name_num.get(i));
        }

        for (int i = 0; i < N; i++) { // 정렬
            int index = 1;
            String min_str = input.get(index);
            for (int j = 3; j < input.size(); j += 2) {
                if (min_str.compareTo(input.get(j)) > 0) {
                    min_str = input.get(j);
                    index = j;
                }
            }

            name_alp.add(input.get(index-1));
            name_alp.add(min_str);
            input.remove(index);
            input.remove(index - 1);
        }

        for (int i = 0; i < M; i++){
            String search = scanner.next();
            if (Character.isAlphabetic(search.charAt(0))) {
                ArrayList<String> copy = new ArrayList<>();
                copy = name_alp;
                int mid = 0;
                while (name_alp.size() > 2) {
                    mid = (name_alp.size() - 1) / 2;
                    if (mid % 2 == 0)
                        mid += 1;
                    if (search.compareTo(name_alp.get(mid)) > 0) {
                        ArrayList<String> tmp = new ArrayList<>(name_alp.subList(mid + 1, name_alp.size()));
                        name_alp = tmp;
                    } else if (search.compareTo(name_alp.get(mid)) < 0) {
                        ArrayList<String> tmp = new ArrayList<>(name_alp.subList(0, mid));
                        name_alp = tmp;
                    } else {
                        break;
                    }
                }
                System.out.println(name_alp.get(mid - 1));
                name_alp = copy;
            }
            else {
                System.out.println(name_num.get(Integer.parseInt(search) - 1));
            }
        }
        scanner.close();
    }
}
