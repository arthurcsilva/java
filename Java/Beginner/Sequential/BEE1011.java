import java.util.Scanner;

public class BEE1011 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int R;
        double volume, PI;

//entrada
        R = teclado.nextInt();
        PI = 3.14159;
//processamento
        volume = (4 / 3.0) * PI * Math.pow(R, 3);
//saída
        System.out.printf("VOLUME = %.3f%n", volume);

        teclado.close();
    }
}