public class OddNumbers {
    public static void main(String[] args) {

        int min = 101;
        int max = 0;
        int sum = 0;

        System.out.println("Odd numbers between 1 to 100:");

        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                sum += i;

                if (i < min) {
                    min = i;
                }

                if (i > max) {
                    max = i;
                }
            }
        }

        System.out.println("\n\nMinimum Odd Number: " + min);
        System.out.println("Maximum Odd Number: " + max);
        System.out.println("Total Sum of Odd Numbers: " + sum);
    }
}
