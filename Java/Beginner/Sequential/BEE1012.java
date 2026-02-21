import java.util.Scanner;

public class BEE1012{
    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);
    double A, B, C, areaTrianguloRet, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;

//entrada
    A = teclado.nextDouble();
    B = teclado.nextDouble();
    C = teclado.nextDouble();
//processamento
    areaTrianguloRet = (A * C) / 2.0;
    areaCirculo = 3.14159 * Math.pow(C, 2);
    areaTrapezio = ((A + B) * C) / 2.0;
    areaQuadrado = Math.pow(B, 2);
    areaRetangulo = A * B;
//saída
    System.out.printf("TRIANGULO: %.3f%n", areaTrianguloRet);
    System.out.printf("CIRCULO: %.3f%n", areaCirculo);
    System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
    System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
    System.out.printf("RETANGULO: %.3f%n", areaRetangulo);

    teclado.close();
    }
}