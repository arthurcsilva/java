package beginner.repetition;

import java.util.Scanner;

public class BEE1131 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int golInter = 0, golGremio = 0, novoGrenal = 0;
        int somaGrenal = 0, vitoriaInter = 0, vitoriaGremio = 0, empates = 0;

        do {
            golInter = scanner.nextInt();
            golGremio = scanner.nextInt();
            somaGrenal++;
            if (golInter > golGremio) {
                vitoriaInter++;
            } else if (golGremio > golInter) {
                vitoriaGremio++;
            } else {
                empates++;
            }
            System.out.println("Novo grenal (1-sim 2-nao)");
            novoGrenal = scanner.nextInt();
        } while (novoGrenal == 1);

        System.out.println(somaGrenal + " grenais");
        System.out.println("Inter:" + vitoriaInter);
        System.out.println("Gremio:" + vitoriaGremio);
        System.out.println("Empates:" + empates);

        if (vitoriaInter > vitoriaGremio) {
            System.out.println("Inter venceu mais");
        } else if (vitoriaGremio > vitoriaInter){
            System.out.println("Gremio venceu mais");
        } else {
            System.out.println("Nao houve vencedor");
        }

        scanner.close();
    }
}
