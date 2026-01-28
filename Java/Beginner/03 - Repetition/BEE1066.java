import java.util.Scanner;

public class BEE1066 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor=0, numPar=0, numImp=0, numPos=0, numNeg=0;

        for (int cont=1; cont <=5; cont++) {
            valor = scanner.nextInt();
            if (valor % 2 == 0) {
                numPar++;
            } else {
                numImp++;
            }
            if (valor > 0) {
                numPos++;
            } else if (valor < 0){
                numNeg++;
            }
        }

        System.out.println(numPar + " valor(es) par(es)");
        System.out.println(numImp + " valor(es) impar(es)");
        System.out.println(numPos + " valor(es) positivo(s)");
        System.out.println(numNeg + " valor(es) negativo(s)");

        scanner.close();
    }
}
