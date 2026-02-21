import java.util.Scanner;

public class BEE1007{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int A, B, C, D, value;

        //entrada
        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();
        D = teclado.nextInt();
        //processamento
        value = (A * B) - (C * D);

        System.out.println("DIFERENCA = " + value);

        teclado.close();
    }
}