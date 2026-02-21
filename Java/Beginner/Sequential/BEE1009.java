import java.util.Scanner;

public class BEE1009{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        String name;
        double salary, totalValue, finalSalary;

        //entrada
        name = teclado.nextLine();
        salary = Double.parseDouble(teclado.nextLine());
        totalValue = Double.parseDouble(teclado.nextLine());
        //processamento
        finalSalary = salary + (totalValue * 0.15);
        //saída
        System.out.printf("TOTAL = R$ %.2f%n", finalSalary);

        teclado.close();
    }
}