import java.util.*;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class BasicStatsApp {

    public static final String APP_TITLE = "Simple stats";
    
    private static BasicStatsModel model = new BasicStatsModel();
    
    public static void main(String ... args) {

    /**
     * Create a simple GUI that includes:
     * - a text field and a button that allows the user to enter numbers.
     * - a button that allows the user to clear all entered numbers.
     * - a panel with labels and text fields for count, median, and mean.
     * - a text area that shows all numbers.
     */

    // Create the main frame of the application, and set size and position
    JFrame jfMain = new JFrame(APP_TITLE);
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
    jpStats.add(new JLabel("Numbers:"));
    jpStats.add(jtfCount);
    jpStats.add(new JLabel("Median:"));
    jpStats.add(jtfMedian);
    jpStats.add(new JLabel("Mean:"));
    jpStats.add(jtfMean);
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
            model.reset();
            jtaNumbers.setText("");
            jtfCount.setText("");
            jtfMedian.setText("");
            jtfMean.setText("");
        }
    });
    JTextField jtfNumber = new JTextField(5);
    JButton jbAdd = new JButton("Add number");
    jbAdd.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            // Parse input and add number to the ArrayList

            Double num = Double.parseDouble(jtfNumber.getText());
            model.addNumber(num);
            jtaNumbers.append(num + ",");

            // Compute and set the count
            int count = model.getArrayDouble().length;
            jtfCount.setText("" + count);

            // Compute and set the mean
            double mean = BasicStats.mean(model.getArrayDouble());
            jtfMean.setText("" + mean);

            // Compute and set the median
            double median = BasicStats.median(model.getArrayDouble());
            jtfMedian.setText("" + median);
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

}
