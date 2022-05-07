package project;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q9996 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String pattern_input = scanner.next();
        String pattern = "";

        for (char x : pattern_input.toCharArray()) {
            if (x != '*')
                pattern += x;
            else
                pattern += "[a-z]*";
        }
        Pattern p = Pattern.compile(pattern);

        for (int i = 0; i < num; i++) {
            Matcher m = p.matcher(scanner.next());
            if (m.matches())
                System.out.println("DA");
            else
                System.out.println("NE");
        }

        scanner.close();
    }
}
