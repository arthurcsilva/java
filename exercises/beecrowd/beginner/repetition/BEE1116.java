package beginner.repetition;

import java.util.Scanner;

public class BEE1116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidadePares = 0, x, y;
        double resultado;

        quantidadePares = sc.nextInt();

        for (int i = 1; i <= quantidadePares; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            resultado = (double) x / (double) y;
            if (y == 0) {
                System.out.println("divisao impossivel");
            } else {
                System.out.printf("%.1f%n", resultado);
            }
        }
        sc.close();
    }
}
