import java.util.Scanner;

public class BEE1020{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int idade, idadeAnos, idadeMeses, idadeDias, restoAnos;

        //entrada
        idade = teclado.nextInt();

        //processamento
        idadeAnos = idade / 365;
        restoAnos = idade % 365;
        idadeMeses = restoAnos / 30;
        idadeDias = restoAnos % 30;

        //saída
        System.out.println(idadeAnos + " ano(s)");
        System.out.println(idadeMeses + " mes(es)");
        System.out.println(idadeDias + " dia(s)");

        teclado.close();
    }
}