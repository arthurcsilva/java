import java.util.Scanner;

public class BEE1040 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double n1 = scanner.nextDouble(),
               n2 = scanner.nextDouble(),
               n3 = scanner.nextDouble(),
               n4 = scanner.nextDouble();

        double media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;
        double mediaTrunc = Math.floor(media * 10) / 10.0; // para utilizar sempre o valor menor, exemplo - media: 4.85 em vez de virar 4.9 vira 4.8

        System.out.printf("Media: %.1f%n", mediaTrunc);

        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");
            double notaExame = scanner.nextDouble();
            System.out.printf("Nota do exame: %.1f%n", notaExame);

            double mediaFinal = (media + notaExame) / 2.0;

            if (mediaFinal >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f%n", mediaFinal);
        }

        scanner.close();
    }
}
