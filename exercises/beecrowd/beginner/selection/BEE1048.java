package beginner.selection;

import java.util.Scanner;

public class BEE1048 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salarioInicial = scanner.nextDouble();
        double novoSalario = 0.00;
        double reajuste = 0.00;
        double percentual = 0;


        if (salarioInicial >= 0 && salarioInicial <= 400){ //poderia colocar uma msg de se o valor for menor do que zero, tentar novamente.
            percentual = 15;
            reajuste = salarioInicial * (percentual / 100);
            novoSalario = salarioInicial + reajuste;
        } else if (salarioInicial <= 800){
            percentual = 12;
            reajuste = salarioInicial * (percentual / 100);
            novoSalario = salarioInicial + reajuste;
        } else if (salarioInicial <= 1200){
            percentual = 10;
            reajuste = salarioInicial * (percentual / 100);
            novoSalario = salarioInicial + reajuste;
        } else if (salarioInicial <= 2000){
            percentual = 7;
            reajuste = salarioInicial * (percentual / 100);
            novoSalario = salarioInicial + reajuste;
        } else if (salarioInicial > 2000){
            percentual = 4;
            reajuste = salarioInicial * (percentual / 100);
            novoSalario = salarioInicial + reajuste;
        }

        System.out.printf("Novo salario: %.2f%n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f%n", reajuste);
        System.out.printf("Em percentual: %.0f %%%n", percentual);

        scanner.close();
    }
}
