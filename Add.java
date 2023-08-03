package org.example;

import java.util.Scanner;

public class Add {
    static String x, y;
    static int add(int x, int y) {
        Scanner sc = new Scanner(System.in);
        x = Integer.parseInt(sc.next());
        y = Integer.parseInt(sc.next());
        System.out.println("숫자를 입력하세요.");
        sc.next();
        System.out.println("숫자를 입력하세요.");
        sc.next();
        sc.close();
        return x + y;
    };
}
