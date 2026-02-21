package beginner.repetition;

import java.util.Scanner;

public class BEE1067 {
    public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);

    int valor = scanner.nextInt();

    for(int cont = 1;cont <= valor;cont+=2){
        System.out.println(cont);
    }

    scanner.close();
    }
}
