public class InvertePyramid {
    public static void main(String[] args) {

        System.out.println("Inverted Right Half Pyramid:");

        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}