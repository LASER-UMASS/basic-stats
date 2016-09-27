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

    //Helper method
    public static void bubbleSort(double[] numArray) {

      int size = numArray.length;
      double hold = 0;

      //Iterate to bubble up O(n^2)
      for (int i = 0; i < size; i++) {
          //Second loop
          for (int j = 1; j < (size - j); j++) {
              //Bubble up
              if (numArray[j - 1] > numArray[j]) {
                  hold = numArray[j - 1];
                  numArray[j - 1] = numArray[j];
                  numArray[j] = hold;
              }

          }
      }
    }

    //Helper method
    public static double[] getArrayDouble(ArrayList<Double> doubles) {
  		double[] result = new double[doubles.size()];

      //O(n) iteration to convert result
  		for (int i = 0 ; i < doubles.size(); i++) {
  			result[i] = doubles.get(i);
  		}

  		return result;
  	}
}
