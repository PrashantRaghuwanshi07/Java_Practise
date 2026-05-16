package Functions;

import java.util.Scanner;

public class Sum {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = sum(20, 30);
        System.out.println(ans);
    }

    static int sum(int a, int b) {
        int add = a + b;
        return add;
    }
}
