public class MinMaxCalculation {
    public static void main(String[] args) {
        // Example input: Change this array to test with different numbers
        int[] numbers = {3, 5, 7, 2, 8, -1, 4};

        int min = numbers[0];
        int max = numbers[0];

        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
