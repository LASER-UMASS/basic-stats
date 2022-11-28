package gui;

import java.util.*;

/**
 * A simple class to compute basic, descriptive statistics.
 */
public class BasicStats {

    public static void main(String ... args) {
        System.out.println("Let's do some basic statistics...");
    }

    /**
     * Computes the maximum of a given array of numbers.
     *
     * @return The maximum value in the given array of numbers
     *
     * @throws IllegalArgumentException if the given array of numbers is null or empty
     */
    public static double maximum(double ... numbers) {
	// Perform input validation (with pre-condition checks)
	if ((numbers == null) || (numbers.length == 0)) {
	    throw new IllegalArgumentException("The given array of numbers must be non-null and non-empty.");
	}

	double maximumValue = numbers[0];
	for (int i = 1; i < numbers.length; i++) {
	    if (numbers[i] > maximumValue) {
		maximumValue = numbers[i];
	    }
	} // end for i

	return maximumValue;
    }    

    /**
     * Compute the mean of an array of numbers.
     */
    public static double mean(double ... numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    /**
     * Compute the median of an array of numbers.
     */
    public static double median(double ... numbers) {
      Arrays.sort(numbers);

      int size = numbers.length;
      double median = 0.0;

      if (size > 0) {
        if (size % 2 == 0) {
          median = (numbers[size >> 1] + numbers[(size >> 1) - 1])/2;
        }
        else {
          median = numbers[size >> 1];
        }
      }

      return median;
    }

    /**
     * Compute the mode of an array of numbers.
     */
    public static double mode(double ... numbers) {
      double mode = 0.0;
      int modeCount = 0;

      for (double num: numbers) {

        int count = 0;

        for (double otherNum: numbers) {
          if (num == otherNum) {
            count++;
          }
        }

        if (count > modeCount) {
          modeCount = count;
          mode = num;
        }

      }

      return mode;
    }
}
