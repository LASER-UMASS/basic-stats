import java.util.ArrayList;

/**
 * @author Patrick Walsh, Matthew Lips
 * MinMaxCalculation.java
 * 
 * Class calculates the min and max of an array of doubles
 */

 /**
  * Class calculates the min and max of an array of doubles
  */
class MinMaxCalculation {
    /**
     * Finds the minimum of an array of doubles
     * @param numbers
     * @return min the minimum number in the array
     */
    public static double findMin(ArrayList<Double> numbers) {
        double min = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) < min) {
                min = numbers.get(i);
            }
        }
        return min;
    }

    /**
     * Finds the maximum of an array of doubles
     * @param numbers
     * @return max the maximum number in the array
     */
    public static double findMax(ArrayList<Double> numbers) {
        double max = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }
        return max;
    }
}