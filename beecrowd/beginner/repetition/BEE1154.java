package beginner.repetition;

import java.util.Scanner;

public class BEE1154 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = 0;
        double sumAge = 0.0, count = 0.0;

        do {
            age = sc.nextInt();
            if (age < 0) {
                break;
            } else {
                sumAge = sumAge + age;
                count++;
            }
        } while (age > 0);

        System.out.printf("%.2f%n", sumAge / count);

        sc.close();
    }
}
