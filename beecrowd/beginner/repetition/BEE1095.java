package beginner.repetition;

    public class BEE1095 {
        public static void main(String[] args) {
            int conti = 1;

            for (int contj = 60; contj >= 0; contj -= 5) {
                System.out.println("I=" + conti + " " + "J=" + contj);
                conti+=3;
            }
        }
    }
