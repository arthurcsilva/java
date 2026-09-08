package beginner.repetition;

import java.util.Scanner;

public class BEE1153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int fator = n;

//        for (int i = 1; i <= n; i++) {
//            fator *= i;
//        }

        for (int i = n - 1; i > 0; i--) {
            fator *= i;
        }

        System.out.println(fator);

        sc.close();
    }
}
