package beginner.repetition;

import java.util.Scanner;

public class BEE1079 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int casosDeTestes = scanner.nextInt();

        for (int i = 0; i < casosDeTestes; i++) {
            double valor = scanner.nextDouble();
            double valor2 = scanner.nextDouble();
            double valor3 = scanner.nextDouble();

            double media = ((valor * 2) + (valor2 * 3) + (valor3 * 5)) / 10;
            System.out.printf("%.1f%n", media);
        }
        scanner.close();
    }
}
