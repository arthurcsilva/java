import java.util.Scanner;

public class BEE1002{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double R, A, PI;

        //entrada
        R  = teclado.nextDouble();
        PI = 3.14159;

        //processamento
        A = PI * (R * R);
        
        //saída
        System.out.printf("A=%.4f%n", A);

        teclado.close();
    }
}