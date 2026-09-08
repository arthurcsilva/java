package beginner.repetition;

public class BEE1098 {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i += 2) {
            double ii = i / 10.0;
            for (double k = 1; k <= 3; k++) {
                double j = ii + k;

                if (ii == 0.0 || ii == 1.0 || ii == 2.0){
                    System.out.printf("I=%.0f J=%.0f\n", ii, j);
                } else {
                    System.out.printf("I=%.1f J=%.1f\n", ii, j);
                }
            }
        }
    }
}
