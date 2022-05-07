package project;

import java.util.Scanner;

public class Q11655 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder input = new StringBuilder();
        input.append(scanner.nextLine());

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isAlphabetic(ch) == true) {
                int temp = 13 + ch;
                if (Character.isUpperCase(ch) && temp >= 91)
                    temp -= 26;
                if (temp >= 123)
                    temp -= 26;
                input.setCharAt(i, (char) (temp));
            }
        }

        System.out.println(input.toString());
        scanner.close();
    }
}
