package gui.view;

import model.BasicStatsModel;


public class CountComputeStrategy implements SimpleStatComputeStrategy
{
    public String getLabelName() {
	return "Count:";
    }

    public double compute(BasicStatsModel model) {
	// Input validation
	if (model == null) {
	    throw new IllegalArgumentException("The model must be non-null.");
	}
	
	return (double)model.getArrayDouble().length;
    }
}
