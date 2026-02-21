import java.util.Scanner;

public class BEE1013{
    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);
    int A , B , C, maiorAB, maiorABC;

//entrada
    A = teclado.nextInt();
    B = teclado.nextInt();
    C = teclado.nextInt();

//fórmula para maior entre a e b
    maiorAB = (A + B + Math.abs(A - B)) / 2;

//fórmula para maior entre maiorAB e C
    maiorABC = (maiorAB + C + Math.abs(maiorAB - C)) / 2;

//saída
    System.out.println(maiorABC + " eh o maior"); 

    teclado.close();
    }
}