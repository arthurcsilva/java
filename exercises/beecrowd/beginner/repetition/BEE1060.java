package beginner.repetition;

import java.util.Scanner;

public class BEE1060 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float valor = 0;
        int numPos=0;

        for (int cont = 1; cont <= 6; cont++){
            valor = scanner.nextFloat();
            if (valor > 0){
                numPos++;
            }
        }

        System.out.println(numPos + " valores positivos");

        scanner.close();
    }
}
