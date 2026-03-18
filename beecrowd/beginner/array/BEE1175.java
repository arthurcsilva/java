package beginner.array;

import java.util.Scanner;

public class BEE1175 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] N = new int[20];

        for (int i = 0; i < N.length; i++) { // leitura
            N[i] = sc.nextInt();                
        }

        for (int i = 0; i < 10; i++) { //swap de valores
            int aux = N[i];
            N[i] = N[19-i];
            N[19-i] = aux;
        }

        for (int i = 0; i < N.length; i++) { // saida dos dados
            System.out.println("N[" + i + "] = " + N[i]);
        }
        sc.close();
    }
}
