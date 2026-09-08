package beginner.repetition;

import java.util.Scanner;

public class BEE1071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y, maior, menor, somaImpares = 0;

        x = sc.nextInt();
        y = sc.nextInt();

        if (x > y) {
            maior = x;
            menor = y;
        } else {
            maior = y;
            menor = x;
        }

        for (int i = menor + 1; i < maior; i++) {
            if (i % 2 != 0) {
                somaImpares += i;
            }
        }

        System.out.println(somaImpares);

        sc.close();
    }
}
