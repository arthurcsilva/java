import java.util.Scanner;

public class BEE1065 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor=0, numPar=0;

        for (int cont=1; cont <=5; cont++) {
            valor = scanner.nextInt();
            if (valor % 2 == 0) {
                numPar++;
            }
        }

        System.out.println(numPar + " valores pares");

        scanner.close();
    }
}
