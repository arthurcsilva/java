package beginner.selection;

import java.util.Scanner;

public class BEE1047 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hrIn = scanner.nextInt();
        int minIn = scanner.nextInt();
        int hrFin = scanner.nextInt();
        int minFin = scanner.nextInt();

        // conversao para minutos
        int inicio = hrIn * 60 + minIn;
        int fim = hrFin * 60 + minFin;

        // Se terminou no mesmo horário ou antes, passou 24h
        if (fim <= inicio) {
            fim += 24 * 60;
        }

        int duracao = fim - inicio;

        int hrDuracao = duracao / 60;
        int minDuracao = duracao % 60;

        System.out.println(
                "O JOGO DUROU " + hrDuracao + " HORA(S) E " + minDuracao + " MINUTO(S)"
        );

        scanner.close();
    }
}
