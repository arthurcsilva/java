package beginner.selection;

import java.util.Scanner;

public class BEE1045 {
    public static void main(String[] args) {
        double menor =0.0, meio=0.0, maior =0.0;

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (a > b && a > c) {
            maior = a;
            if (b > c) {
                meio = b;
                menor = c;
            } else {
                meio = c;
                menor = b;
            }
        } else if (b > a && b > c) {
                    maior = b;
                    if (a > c) {
                        meio = a;
                        menor = c;
                    } else{
                        meio = c;
                        menor = a;
                    }
        } else {
            maior = c;
            if(a > b){
                meio = a;
                menor = b;
            }else {
                meio = b;
                menor = a;
            }
        }

        if (maior >= meio + menor) {  // Verifica se forma triângulo
            System.out.println("NAO FORMA TRIANGULO");
        } else {

            // Classificação por ângulo
            double maior2 = maior * maior;
            double soma2 = (meio * meio) + (menor * menor);

            if (maior2 == soma2) {
                System.out.println("TRIANGULO RETANGULO");
            } else if (maior2 > soma2) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else {
                System.out.println("TRIANGULO ACUTANGULO");
            }

            // Classificação por lados
            if (maior == meio && meio == menor) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (maior == meio || maior == menor || meio == menor) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }

        scanner.close();

    }
}
