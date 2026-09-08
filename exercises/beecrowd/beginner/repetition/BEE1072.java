package beginner.repetition;

import java.util.Scanner;

public class BEE1072 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeValoresFuturos;
        int somaVerdadeiro = 0, somaNegativo = 0;

        quantidadeValoresFuturos = scanner.nextInt();

        for (int i = 0; i < quantidadeValoresFuturos; i++) {
            int valores = scanner.nextInt();
            if (valores >= 10 && valores <= 20) {
                somaVerdadeiro += 1;
            } else {
                somaNegativo += 1;
            }
        }

        System.out.println(somaVerdadeiro + " in");
        System.out.println(somaNegativo + " out");

        scanner.close();
    }
}
