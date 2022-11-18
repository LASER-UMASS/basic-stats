package gui.view;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import model.BasicStatsModel;


public class NumbersView implements View
{
    /** TextArea that shows all the numbers */
    private JTextArea jtaNumbers;

    
    public NumbersView(JFrame jfMain) {
	super();

	jtaNumbers = new JTextArea(10, 5);
	jtaNumbers.setEditable(false);

	jfMain.getContentPane().add(jtaNumbers, BorderLayout.SOUTH);
    }

    public void update(BasicStatsModel model) {
	// Reset
	if (model.getArrayDouble().length == 0) {
	    jtaNumbers.setText("");
	}
	// Add number
	else {
	    // Update the displayed list of numbers
	    double num = model.getArrayDouble()[model.getArrayDouble().length - 1];
	    jtaNumbers.append(num + ",");
	}
    }
}
