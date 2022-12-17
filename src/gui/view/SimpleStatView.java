package gui.view;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.BasicStatsModel;


/**
 * The SimpleStatView class displays a simple statistic to summarize 
 * the list of numbers.
 *
 * NOTE) This class is applying the Strategy design pattern.
 */
public class SimpleStatView implements View
{
    private SimpleStatComputeStrategy computeStrategy;
    private JLabel jlSimpleStat;
    private JTextField jtfSimpleStat;

    
    public SimpleStatView(JPanel jpStats, SimpleStatComputeStrategy computeStrategy) {
	super();

	// Input validation
	if (computeStrategy == null) {
	    throw new IllegalArgumentException("The compute strategy must be non-null.");
	}
	this.computeStrategy = computeStrategy;
	
	jlSimpleStat = new JLabel(this.computeStrategy.getLabelName());
	jtfSimpleStat = new JTextField(5);
	jtfSimpleStat.setEditable(false);

	jpStats.add(jlSimpleStat);
	jpStats.add(jtfSimpleStat);
    }

    public void update(BasicStatsModel model) {
	// Reset
	if (model.getArrayDouble().length == 0) {
	    this.jtfSimpleStat.setText("");
	}
	// Add number
	else {
	    double simpleStat = this.computeStrategy.compute(model);
	    this.jtfSimpleStat.setText("" + simpleStat);
	}
    }

    public String getStringValue() {
	// This is a snapshot of the current value to support
	// testability and debuggability without breaking the encapsulation.
	return jtfSimpleStat.getText();
    }
}
