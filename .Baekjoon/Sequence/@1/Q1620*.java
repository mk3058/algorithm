package project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String[] name = new String[n];

        for (int i = 0; i < n; i++) {
            name[i] = scanner.next();
        }

        for (int i = 0; i < m; i++) {
            String input = scanner.next();
            if (Character.isDigit(input.charAt(0))) {
                System.out.println(name[Integer.parseInt(input) - 1]);
            } else {
                for (int j = 0; j < n; j++) {
                    if (name[j].length() == input.length()) {
                        if (name[j].equalsIgnoreCase(input)) {
                            System.out.println(j + 1);
                            break;
                        }
                    }
                }
            }
        }

        scanner.close();
    }
}
