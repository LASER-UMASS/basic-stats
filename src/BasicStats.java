import java.util.*;

/**
 * A simple class to compute basic, descriptive statistics.
 */
public class BasicStats {

    public static void main(String ... args) {
        System.out.println("Let's do some basic statistics...");
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
      bubbleSort(numbers);

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

    public static void bubbleSort(double[] numArray) {

      int n = numArray.length;
      double temp = 0;

      for (int i = 0; i < n; i++) {
          for (int j = 1; j < (n - i); j++) {

              if (numArray[j - 1] > numArray[j]) {
                  temp = numArray[j - 1];
                  numArray[j - 1] = numArray[j];
                  numArray[j] = temp;
              }

          }
      }
    }

    public static double[] getArrayDouble(ArrayList<Double> doubles) {
  		double[] result = new double[doubles.size()];

  		for (int i = 0 ; i < doubles.size(); i++) {
  			result[i] = doubles.get(i);
  		}

  		return result;
  	}
}
