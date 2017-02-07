import java.util.*;

import java.util.*;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

/**
 * A simple class to compute basic, descriptive statistics.
 */
public class BasicStats {

  // Store all collected numbers
  private static ArrayList<Double> data = new ArrayList<Double>();

  public static void main(String ... args) {

    //Initialize controllers
    AddNumCtrl numCtrl = new AddNumCtrl();
    ResetCtrl resetCtrl = new ResetCtrl();

    //Initialize model
    Numbers numbers = new Numbers();

    //Initialize views
    CountView countView = new CountView();
    MeanView meanView = new MeanView();
    MedianView medianView = new MedianView();
    ModeView modeView = new ModeView();
    NumbersView numbersView = new NumbersView();
    AddNumView addNumView = new AddNumView();
    ResetView resetView = new ResetView();

    //Create statsView
    ArrayList<View> statsViews = new ArrayList<View>();
    statsViews.add(countView);
    statsViews.add(medianView);
    statsViews.add(meanView);
    statsViews.add(modeView);

    /***** REGISTER MVC BLOCK *****/

    //Register models to controls
    numCtrl.addModel(numbers);
    resetCtrl.addModel(numbers);

    //Register views to models
    for (View view: statsViews) {
      numbers.addObserver(view);
    }
    numbers.addObserver(numbersView);
    numbers.addObserver(addNumView);
    numbers.addObserver(resetView);

    //Register controls to views
    addNumView.addController(numCtrl);
    resetView.addController(resetCtrl);

    /***** END OF REGISTER MVC BLOCK *****/

    // Create the main frame of the application, and set size and position
    JFrame jfMain = new JFrame("Simple stats");
    jfMain.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    jfMain.setSize(1000,900);
    jfMain.setLocationRelativeTo(null);

    // Panel that shows stats about the numbers
    JPanel jpStats = new JPanel(new FlowLayout(FlowLayout.CENTER));

    for (View view: statsViews) {
      jpStats.add(new JLabel(view.getName() + ":"));
      jpStats.add(view.show());
    }

    //Set stats view
    jfMain.getContentPane().add(jpStats, BorderLayout.CENTER);

    // TextArea that shows all the numbers
    jfMain.getContentPane().add(numbersView.show(), BorderLayout.SOUTH);

    //Create panel for input
    JPanel jpInput = new JPanel(new FlowLayout(FlowLayout.CENTER));
    jpInput.add(addNumView.show());
    jpInput.add(addNumView.getButton());
    jpInput.add(resetView.getButton());

    //Set input view
    jfMain.getContentPane().add(jpInput, BorderLayout.NORTH);

    // Show the frame
    jfMain.setVisible(true);

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

    //Helper method
    public static double[] doInsertionSort(double[] input){
        double hold;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j] < input[j-1]){
                    hold = input[j];
                    input[j] = input[j-1];
                    input[j-1] = hold;
                }
            }
        }
        return input;
    }
}
