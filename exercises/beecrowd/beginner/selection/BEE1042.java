package beginner.selection;

import java.util.Scanner;

public class BEE1042 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int min=0, mid=0, max=0;

        if (a <= b && a <= c) {
            min = a;
            if (b < c) {
                mid = b;
                max = c;
        } else {
                mid = c;
                max = b;
            }
        } else if (b <= a && b <= c) {
                    min = b;
                    if (a < c) {
                        mid = a;
                        max = c;
                    } else {
                        mid = c;
                        max = a;
                    }
        } else {
                    min = c;
                    if (a < b) {
                        mid = a;
                        max = b;
                    } else  {
                        mid = b;
                        max = a;
                    }
        }

        System.out.println(min);
        System.out.println(mid);
        System.out.println(max);

        System.out.println();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        scanner.close();
    }
}
