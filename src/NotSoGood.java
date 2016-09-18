import java.util.*;
import javax.swing.*;

public class NotSoGood {

		// Store all collected numbers
    private static ArrayList<Integer> data = new ArrayList<Integer>();

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



    // Show the frame
    jfMain.setVisible(true);

	}

}
