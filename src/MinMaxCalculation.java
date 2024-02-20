public class MinMaxCalculation {
    /**
     * Compute the maximum of an array of numbers.
     */
    public static double max(double... numbers) {
        double max = numbers[0];
        for (double num : numbers) {
            if (num > max)
                max = num;
        }
        return max;
    }

    /**
     * Compute the minimum of an array of numbers.
     */
    public static double min(double... numbers) {
        double min = numbers[0];
        for (double num : numbers) {
            if (num < min)
                min = num;
        }
        return min;
    }
}
