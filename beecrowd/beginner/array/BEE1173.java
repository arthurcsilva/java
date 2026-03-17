package beginner.array;

import java.util.Scanner;

public class BEE1173 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int entrada = sc.nextInt();

        int[] num = new int[10];

        for (int i = 0; i < num.length; i++) {
            num[i] = entrada;
            System.out.println("N[" + i + "] = "+ num[i]);
            entrada = entrada * 2;
        }
        sc.close();
    }
}
