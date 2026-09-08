package beginner.repetition;

public class BEE1096 {
    public static void main(String[] args) {
        int i, j;

        for (int conti = 1; conti <= 9; conti += 2) {
            for (int contj = 7; contj >= 5; contj--) {
                System.out.println("I=" + conti + " " + "J=" + contj);
            }
        }
    }
}
