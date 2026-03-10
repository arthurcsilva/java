package beginner.repetition;

import java.util.Scanner;

public class BEE1074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantitiesOfValue = sc.nextInt();
        int value = 0;

        for (int i = 0; i < quantitiesOfValue; i++) {

            value = sc.nextInt();
            if (value == 0){
                System.out.println("NULL");
                continue;
            } else if (value % 2 == 0){
                System.out.print("EVEN ");
            } else {
                System.out.print("ODD ");
            }
            if (value > 0){
                System.out.println("POSITIVE");
            } else {
                System.out.println("NEGATIVE");
            }

        }

        sc.close();
    }
}
