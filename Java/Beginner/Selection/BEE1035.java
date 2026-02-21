import java.util.Scanner;

public class BEE1035 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        boolean cond1 = B > C;
        boolean cond2 = D > A;
        boolean cond3 = (C + D) > (A + B);
        boolean cond4 = C > 0 && D > 0;
        boolean cond5 = A % 2 == 0;

        if (cond1 && cond2 && cond3 && cond4 && cond5) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }

        scanner.close();

    }
}
