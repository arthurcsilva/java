package beginner.repetition;

import java.util.Scanner;

public class BEE1115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = 0, y = 0;
        boolean cond1 = false, cond2 = false, cond3 = false, cond4 = false;

        do {
            x = sc.nextInt();
            y = sc.nextInt();
            cond1 = (x > 0 && y > 0);
            cond4 = (x > 0 && y < 0);
            cond2 = (x < 0 && y > 0);
            cond3 = (x < 0 && y < 0);
            if (cond1) {
                System.out.println("primeiro");
            } else if (cond2) {
                System.out.println("segundo");
            } else if (cond3) {
                System.out.println("terceiro");
            } else if (cond4) {
                System.out.println("quarto");
            } else {
                break;
            }
        } while (cond1 || cond2 || cond3 || cond4);

        sc.close();
    }
}
