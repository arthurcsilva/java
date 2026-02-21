import java.util.Scanner;

public class BEE1008{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int number, hours;
        float salary, salaryTotal;

        //entrada
        number = teclado.nextInt();
        hours = teclado.nextInt();
        salary = teclado.nextFloat();
        //processamento
        salaryTotal = salary * hours;
        //saída
        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f%n", salaryTotal);

        teclado.close();
    }
}