import java.util.Scanner;

public class BEE1014{
    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);
    int X;
    double Y, Total;

    //entrada
    X = teclado.nextInt();
    Y = teclado.nextDouble();

    //processamento
    Total = X / Y;

    //saída
    System.out.printf("%.3f km/l%n", Total);

    teclado.close();
    }
}