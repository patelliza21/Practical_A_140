public class OddNumbers {
    public static void main(String[] args) {

        int sum = 0, count = 0;

        System.out.println("Odd numbers between 1 to 50:");

        for (int i = 1; i <= 50; i += 2) {
            System.out.print(i + " ");
            sum += i;
            count++;
        }

        System.out.println("\n\nThree Minimum Odd Numbers:");
        System.out.println("1 3 5");

        System.out.println("\nThree Maximum Odd Numbers:");
        System.out.println("45 47 49");

        double avg = (double) sum / count;
        System.out.println("\nAverage of odd numbers: " + avg);
    }
}
