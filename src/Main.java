public class Main {
    public static void main(String[] args) {
        for (int i = 80; i > 0; i--) {
            double vergrößerungsfaktor;
            vergrößerungsfaktor=85 * Math.log10(i);
            for (int j = 0; j < vergrößerungsfaktor; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
