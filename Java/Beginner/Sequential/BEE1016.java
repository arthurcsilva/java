import java.util.Scanner;

public class BEE1016{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int kmTotal, tempoTotal;

        //entrada
        kmTotal = teclado.nextInt();

        /*
        A cada hora, o carro Y percorre 30 km a mais que o carro X (90 km - 60 km = 30 km).
        Se para se afastar 30 km ele leva 60 minutos
        Para se afastar 1 km, ele levará: 60 minutos/30 km = 2 minutos
        
        */

       tempoTotal = (kmTotal * 2);

       //saída

       System.out.println(tempoTotal + " minutos");

        teclado.close();
    }
}