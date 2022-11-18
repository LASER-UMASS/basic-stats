package gui.view;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.BasicStatsModel;


public class CountView implements View
{
    private JLabel jlCount;
    private JTextField jtfCount;

    
    public CountView(JPanel jpStats) {
	super();

	jlCount = new JLabel("Numbers:");
	jtfCount = new JTextField(5);
	jtfCount.setEditable(false);

	jpStats.add(jlCount);
	jpStats.add(jtfCount);
    }

    public void update(BasicStatsModel model) {
	// Reset
	if (model.getArrayDouble().length == 0) {
	    this.jtfCount.setText("");
	}
	// Add number
	else {
	    int count = model.getArrayDouble().length;
	    this.jtfCount.setText("" + count);
	}
    }
}
