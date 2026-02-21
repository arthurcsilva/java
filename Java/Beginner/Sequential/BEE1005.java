import java.util.Scanner;

public class BEE1005{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float A, B, MEDIA;

        //entrada
        A = teclado.nextFloat();
        B = teclado.nextFloat();
        //processamento
        MEDIA = ((A*3.5f) + (B*7.5f)) / (3.5f + 7.5f);
        //saída
        System.out.printf("MEDIA = %.5f%n", MEDIA);

        teclado.close();

    }
}