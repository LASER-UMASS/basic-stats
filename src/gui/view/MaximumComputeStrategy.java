package gui.view;

import gui.BasicStats;
import model.BasicStatsModel;


public class MaximumComputeStrategy implements SimpleStatComputeStrategy
{
    public String getLabelName() {
	return "Maximum:";
    }

    public double compute(BasicStatsModel model) {
	// Input validation performed in BasicStats
	return BasicStats.maximum(model.getArrayDouble());
    }
}
