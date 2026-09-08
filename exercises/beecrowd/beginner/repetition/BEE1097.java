package beginner.repetition;

public class BEE1097 {
    public static void main(String[] args) {

        for (int i = 1; i <= 9; i += 2) {
            int j = i + 6;
            for (int k = 0; k < 3; k++) {
                System.out.println("I=" + i + " J=" + j);
                j--;
            }
        }
    }
}
