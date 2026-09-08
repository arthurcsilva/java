package beginner.repetition;

import java.util.Scanner;

public class BEE1078 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + valor + " = " + (valor * i));
        }
        scanner.close();
    }
}
