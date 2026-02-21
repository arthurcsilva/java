import java.util.Scanner;

public class BEE1043 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        boolean cond1 = (A + B) > C;
        boolean cond2 = (A + C) > B;
        boolean cond3 = (B + C) > A;

        if (cond1 && cond2 && cond3) {
            double perimetro = A + B + C;
            System.out.printf("Perimetro = %.1f%n", perimetro);
        } else {
            double areaTrapezio = ((A + B) * C) / 2.0;
            System.out.printf("Area = %.1f%n", areaTrapezio);
        }

        scanner.close();
    }
}