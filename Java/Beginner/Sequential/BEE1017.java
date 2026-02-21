import java.util.Scanner;

public class BEE1017{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int horasViagem, velMedia;
        double litrosTotal;

        //entrada
        horasViagem = teclado.nextInt();
        velMedia = teclado.nextInt();

        //processamento
        litrosTotal = (velMedia * horasViagem) / 12.0;

        //saída
        System.out.printf("%.3f%n", litrosTotal);

        teclado.close();
    }
}