package beginner.selection;

import java.util.Scanner;

public class BEE1046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hrInicial = scanner.nextInt();
        int hrFinal = scanner.nextInt();
        int tempoJogo = 0;

        if (hrFinal > hrInicial) {
            tempoJogo = hrFinal - hrInicial;
        } else if (hrFinal < hrInicial) {
            tempoJogo = (24 - hrInicial) + hrFinal;
        } else if (hrFinal - hrInicial == 0) {
            tempoJogo = 24;
        }

        System.out.println("O JOGO DUROU " + tempoJogo + " HORA(S)");

        scanner.close();
    }
}
