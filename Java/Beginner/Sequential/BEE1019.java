import java.util.Scanner;

public class BEE1019{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int tempo, horas, minutos, segundos, restoHoras;

        //entrada
        tempo = teclado.nextInt();

        //processamento

        horas = tempo / 3600;
        restoHoras = tempo % 3600;
        minutos = restoHoras / 60;
        segundos = tempo % 60;

        //saída

        System.out.println(horas + ":" + minutos + ":" + segundos);

        teclado.close();
    }
}