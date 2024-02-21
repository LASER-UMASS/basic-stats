public class MinMaxCalculation {
  public static void main(String[] args) {
    // Example array
    int[] numbers = {5, 3, 8, 2, 1, 9, 4};

    // Initialize min and max with the first element of the array
    int min = numbers[0];
    int max = numbers[0];

    // Iterate through the array to find min and max
    for (int i = 1; i < numbers.length; i++) {
      if (numbers[i] < min) {
        min = numbers[i];
      }
      if (numbers[i] > max) {
        max = numbers[i];
      }
    }

    // Print the results
    System.out.println("Minimum value: " + min);
    System.out.println("Maximum value: " + max);
  }
}
