package gui.view;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.BasicStatsModel;
import gui.BasicStats;


public class MedianView implements View
{
    private JLabel jlMedian;
    private JTextField jtfMedian;

    
    public MedianView(JPanel jpStats) {
	super();

	jlMedian = new JLabel("Median:");
	jtfMedian = new JTextField(5);
	jtfMedian.setEditable(false);

	jpStats.add(jlMedian);
	jpStats.add(jtfMedian);
    }

    public void update(BasicStatsModel model) {
	// Reset
	if (model.getArrayDouble().length == 0) {
	    jtfMedian.setText("");
	}
	// Add number
	else {
	    double median = BasicStats.median(model.getArrayDouble());
	    jtfMedian.setText("" + median);
	}
    }
}
