package beginner.repetition;

import java.util.Scanner;

public class BEE1099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantitiesTest = sc.nextInt();
        int somaImpares =0;

        for (int i = 1; i <= quantitiesTest; i++) {
            somaImpares = 0;
            int x = sc.nextInt();
            int y = sc.nextInt();

            int menor = Math.min(x, y);
            int maior = Math.max(x, y);

            for (int j = menor + 1; j < maior; j++) {
                if (j % 2 != 0) {
                    somaImpares += j;
                }
            }
            System.out.println(somaImpares);
        }
        sc.close();
    }
}
