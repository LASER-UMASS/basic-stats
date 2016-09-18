import java.util.*;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class NotSoGood {

		// Store all collected numbers
    private static ArrayList<Double> data = new ArrayList<Double>();

    public static void main(String ... args) {

		/**
     * Create a simple GUI that includes:
     * - a text field and a button that allows the user to enter numbers.
     * - a button that allows the user to clear all entered numbers.
     * - a panel with labels and text fields for count, median, and mean.
     * - a text area that shows all numbers.
     */

    // Create the main frame of the application, and set size and position
    JFrame jfMain = new JFrame("Simple stats");
    jfMain.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    jfMain.setSize(600,400);
    jfMain.setLocationRelativeTo(null);

		// Panel that shows stats about the numbers
    JPanel jpStats = new JPanel(new FlowLayout(FlowLayout.CENTER));
    JTextField jtfCount = new JTextField(5);
    jtfCount.setEditable(false);
    JTextField jtfMedian = new JTextField(5);
    jtfMedian.setEditable(false);
    JTextField jtfMean = new JTextField(5);
    jtfMean.setEditable(false);
		JTextField jtfMode = new JTextField(5);
		jtfMode.setEditable(false);

    jpStats.add(new JLabel("Numbers:"));
    jpStats.add(jtfCount);
    jpStats.add(new JLabel("Median:"));
    jpStats.add(jtfMedian);
    jpStats.add(new JLabel("Mean:"));
    jpStats.add(jtfMean);
		jpStats.add(new JLabel("Mode:"));
		jpStats.add(jtfMode);
    jfMain.getContentPane().add(jpStats, BorderLayout.CENTER);

    // TextArea that shows all the numbers
    JTextArea jtaNumbers = new JTextArea(10,50);
    jtaNumbers.setEditable(false);
    jfMain.getContentPane().add(jtaNumbers, BorderLayout.SOUTH);


    // Panel with a text field/button to enter numbers and a button to reset the application
    JButton jbReset = new JButton("Reset");
    jbReset.addActionListener(new ActionListener() {
        // The interface ActionListener defines a call-back method actionPerformed,
        // which is invoked if the user interacts with the GUI component -- in this
        // case, if the user clicks the button.
        public void actionPerformed(ActionEvent e) {
            // Clear the ArrayList and all text fields
            data.clear();
            jtaNumbers.setText("");
            jtfCount.setText("");
            jtfMedian.setText("");
            jtfMean.setText("");
						jtfMode.setText("");
        }
    });
    JTextField jtfNumber = new JTextField(5);
    JButton jbAdd = new JButton("Add number");
    jbAdd.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            // Parse input and add number to the ArrayList

            Double num = Double.parseDouble(jtfNumber.getText());
            data.add(num);
            jtaNumbers.append(num + ",");

            // Compute and set the count
            int count = data.size();
            jtfCount.setText("" + count);

            // Compute and set the mean
            double mean = BasicStats.mean(getArrayDouble(data));
            jtfMean.setText("" + mean);

            // Compute and set the median
            double median = BasicStats.median(getArrayDouble(data));
            jtfMedian.setText("" + median);

						//Compute and set the mode
						double mode = BasicStats.mode(getArrayDouble(data));
						jtfMode.setText("" + mode);
        }
    });
    JPanel jpInput = new JPanel(new FlowLayout(FlowLayout.CENTER));
    jpInput.add(jtfNumber);
    jpInput.add(jbAdd);
    jpInput.add(jbReset);

    jfMain.getContentPane().add(jpInput, BorderLayout.NORTH);

    // Show the frame
    jfMain.setVisible(true);

	}

	private static double[] getArrayDouble(ArrayList<Double> doubles) {
		double[] result = new double[doubles.size()];

		for (int i = 0 ; i < doubles.size(); i++) {
			result[i] = doubles.get(i);
		}

		return result;
	}

}
