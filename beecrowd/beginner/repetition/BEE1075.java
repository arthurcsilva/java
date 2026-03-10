package beginner.repetition;

import java.util.Scanner;

public class BEE1075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int value = sc.nextInt();

        for (int i = 1; i <= 10000; i++) {
            if (i % value == 2){
                System.out.println(i);
            }
        }

        sc.close();
    }
}
