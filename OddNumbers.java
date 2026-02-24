public class OddNumbers {
    public static void main(String[] args) {

        int min = 1;
        int max = 99;
        int sum = 0;

        System.out.println("Odd Numbers between 1 to 100:");

        for (int i = 1; i <= 100; i += 2) {
            System.out.print(i + " ");
            sum += i;
        }

        System.out.println("\nMinimum Odd Number: " + min);
        System.out.println("Maximum Odd Number: " + max);
        System.out.println("Total Sum: " + sum);
    }
}