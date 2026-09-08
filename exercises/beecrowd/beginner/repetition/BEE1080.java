package beginner.repetition;

import java.util.Scanner;

public class BEE1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pos = 1;
        int value = sc.nextInt();
        int numMaior = value;

        for (int i = 2; i <= 100; i++) {
            value = sc.nextInt();
            if (value > numMaior){
                numMaior = value;
                pos = i;
            }
        }

        System.out.println(numMaior);
        System.out.println(pos);

        sc.close();
    }
}
