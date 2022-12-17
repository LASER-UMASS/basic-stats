package gui.view;

import gui.BasicStats;
import model.BasicStatsModel;


public class MeanComputeStrategy implements SimpleStatComputeStrategy
{
    public String getLabelName() {
	return "Mean:";
    }

    public double compute(BasicStatsModel model) {
	return BasicStats.mean(model.getArrayDouble());
    }
}
