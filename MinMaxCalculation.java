public class MinMaxCalculation {
    public static double min(double ... numbers) {
        double min = Double.MAX_VALUE;
        for (double num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static double max(double ... numbers) {
        double max = Double.MIN_VALUE;
        for (double num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}