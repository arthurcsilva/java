import java.util.Scanner;

public class BEE1051 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double salario = scanner.nextDouble();
        double ir = 0.00;

        if (salario < 2000.00) {
            System.out.println("Isento");
        } else if (salario <= 3000.00){
            ir = (salario - 2000.00) * 0.08;
            System.out.printf("R$ %.2f%n", ir);
        } else if (salario <= 4500.00){
            ir = 80.00 + (salario - 3000.00) * 0.18;
            System.out.printf("R$ %.2f%n", ir);
        } else {
            ir = 80.00 + 270.00 + (salario - 4500) * 0.28;
            System.out.printf("R$ %.2f%n", ir);
        }

        scanner.close();
    }
}
