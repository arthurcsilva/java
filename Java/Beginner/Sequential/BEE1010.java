import java.util.Scanner;

public class BEE1010 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int cod1, qtd1, cod2, qtd2;
        double valorUnit1, valorUnit2, valorTotal;

//entrada
        cod1 = teclado.nextInt(); 
        qtd1 = teclado.nextInt();
        valorUnit1 = teclado.nextDouble();

        cod2 = teclado.nextInt();
        qtd2 = teclado.nextInt();
        valorUnit2 = teclado.nextDouble();
//processamento
        valorTotal = (qtd1 * valorUnit1) + (qtd2 * valorUnit2);
//saída
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);

        teclado.close();
    }
}