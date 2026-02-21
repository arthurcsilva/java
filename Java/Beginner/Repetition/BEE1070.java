import java.util.Scanner;

public class BEE1070 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor = scanner.nextInt();

        if (valor % 2 == 0){
            valor = valor + 1;
        }

        for (int cont=1;cont <= 6;cont++){
            System.out.println(valor);
            valor+=2;
        }

        scanner.close();
    }
}
