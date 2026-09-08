package beginner.repetition;

import java.util.Scanner;

public class BEE1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numTestes = sc.nextInt();

        for (int i = 1; i <= numTestes; i++) {
            int x = 0, y = 0;
            int soma = 0;
            x = sc.nextInt();
            y = sc.nextInt();
            if (x % 2 != 0) {
                x = x;
            } else {
                x += 1;
            }
            for (int j = 1; j <= y; j++) {
                soma += x;
                x += 2;
            }
            System.out.println(soma);
        }
        sc.close();
    }
}
