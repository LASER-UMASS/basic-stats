package gui.view;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.BasicStatsModel;
import gui.BasicStats;


public class MeanView implements View
{
    private JLabel jlMean;
    private JTextField jtfMean;

    
    public MeanView(JPanel jpStats) {
	super();

	jlMean = new JLabel("Mean:");
	jtfMean = new JTextField(5);
	jtfMean.setEditable(false);

	jpStats.add(jlMean);
	jpStats.add(jtfMean);
    }

    public void update(BasicStatsModel model) {
	// Reset
	if (model.getArrayDouble().length == 0) {
	    jtfMean.setText("");
	}
	// Add number
	else {
	    double mean = BasicStats.mean(model.getArrayDouble());
	    jtfMean.setText("" + mean);
	}
    }
}
