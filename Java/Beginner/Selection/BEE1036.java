import java.util.Scanner;

public class BEE1036 {
    public static void main(String[] args) {
//        Leia 3 valores de ponto flutuante
//        efetue o cálculo das raízes da equação de Bhaskara
//        Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”,
//        caso haja uma divisão por 0 ou raiz de numero negativo.

        Scanner scanner = new Scanner(System.in);

        // Entrada dos coeficientes
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        // Cálculo do delta (discriminante)
        double delta = Math.pow(b, 2) - (4 * a * c);

        if (delta < 0 || a == 0) {
            System.out.println("Impossivel calcular");
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.printf("X1 = %.5f%n", x1);
            System.out.printf("X2 = %.5f%n", x2);

            scanner.close();
        }
    }
}
