public class MinMaxCalculation {
    
    public static void main(String[] args) {
        int[] numbers = {5, 10, 3, 8, 15}; // Example array of numbers

        // Compute the minimum and maximum
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            } else if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Print the results
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
