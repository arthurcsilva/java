package beginner.repetition;

import java.util.Scanner;

public class BEE1117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota = 0;
        double somaNotas = 0, media = 0;
        int notasValidas = 0;

        while (notasValidas < 2) {
            nota = sc.nextDouble();
            if (nota < 0 || nota > 10) {
                System.out.println("nota invalida");
            } else {
                somaNotas += nota;
                notasValidas++;
            }
        }

//        do{
//            nota = sc.nextDouble();
//            if (nota < 0 || nota > 10) {
//                System.out.println("nota invalida");
//            } else {
//                somaNotas += nota;
//                notasValidas++;
//            }
//        } while(notasValidas < 2);

        media = somaNotas / 2.0;
        System.out.printf("media = %.2f%n", media);
        sc.close();
    }
}
