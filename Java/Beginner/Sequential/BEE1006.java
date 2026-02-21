import java.util.Scanner;

public class BEE1006{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double A, B, C, MEDIA;

        //entrada
        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();
        //processamento
        MEDIA = ((A*2.0) + (B*3.0) + (C*5.0)) / (2.0 + 3.0 + 5.0);
        //saída
        System.out.printf("MEDIA = %.1f%n", MEDIA);

        teclado.close();
    }
}