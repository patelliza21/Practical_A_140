import java.util.ArrayList;
import java.util.List;

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

        System.out.println("\nOdd Numbers between 1 and 50:");

        List<Integer> oddList = new ArrayList<>();

        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                oddList.add(i);
                sum += i;
                System.out.print(i + " ");
            }
        }

        // Three minimum odd numbers
        System.out.println("\n\nThree Minimum Odd Numbers:");
        for (int i = 0; i < 3; i++) {
            System.out.print(oddList.get(i) + " ");
        }

        // Three maximum odd numbers
        System.out.println("\nThree Maximum Odd Numbers:");
        for (int i = oddList.size() - 3; i < oddList.size(); i++) {
            System.out.print(oddList.get(i) + " ");
        }

        // Average calculation
        double avg = (double) sum / oddList.size();
        System.out.println("\nAverage of Odd Numbers: " + avg);
    }
}