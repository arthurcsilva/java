package beginner.array;

import java.util.Scanner;

public class BEE1172 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[10];

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
            if (num[i] < 0 || num[i] == 0){
                num[i] = 1;
            }
            System.out.println("X[" + i + "] = "+ num[i]);
        }

        sc.close();
    }
}

