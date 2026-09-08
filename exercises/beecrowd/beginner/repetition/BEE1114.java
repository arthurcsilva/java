package beginner.repetition;

import java.util.Scanner;

public class BEE1114 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int password = 0;

        do {
            password = scanner.nextInt();
            if (password != 2002) {
                System.out.println("Senha Invalida");
            }
        } while (password != 2002);

        System.out.println("Acesso Permitido");
        scanner.close();
    }
}
