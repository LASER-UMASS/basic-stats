package gui.view;

import gui.BasicStats;
import model.BasicStatsModel;


public class MedianComputeStrategy implements SimpleStatComputeStrategy
{
    public String getLabelName() {
	return "Median:";
    }

    public double compute(BasicStatsModel model) {
	return BasicStats.median(model.getArrayDouble());
    }
}
