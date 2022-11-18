package gui.view;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.BasicStatsModel;
import gui.BasicStats;


public class MaximumView implements View
{
    private JLabel jlMaximum;
    private JTextField jtfMaximum;

    
    public MaximumView(JPanel jpStats) {
	super();

	jlMaximum = new JLabel("Maximum:");
	jtfMaximum = new JTextField(5);
	jtfMaximum.setEditable(false);

	jpStats.add(jlMaximum);
	jpStats.add(jtfMaximum);
    }

    public void update(BasicStatsModel model) {
	// Reset
	if (model.getArrayDouble().length == 0) {
	    jtfMaximum.setText("");
	}
	// Add number
	else {
	    double maximum = BasicStats.maximum(model.getArrayDouble());
	    jtfMaximum.setText("" + maximum);
	}
    }
}
