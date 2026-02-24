public class InvertePyramid {

    public static void main(String[] args) {

        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // ----- Number Pyramid -----
        int num = 1;

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;

                if (num > 9) {
                    num = 1; // restart after 9
                }
            }
            System.out.println();
        }
    }
}