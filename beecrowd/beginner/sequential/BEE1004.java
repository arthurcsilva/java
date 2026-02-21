package beginner.sequential;

import java.util.Scanner;

public class BEE1004{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int A, B, PROD;

        //entrada
        A = teclado.nextInt();
        B = teclado.nextInt();
        //processamento
        PROD = A * B;
        //saída
        System.out.println("PROD = " + PROD);

        teclado.close();

    }
}