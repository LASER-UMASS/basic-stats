package gui.view;

import model.BasicStatsModel;


/**
 * The SimpleStatComputeStrategy interface computes a simple statistic
 * to summarize the list of numbers.
 *
 * NOTE) The SimpleStatsView class is applying the Strategy design pattern.
 *       This interface is the helper method.
 */
public interface SimpleStatComputeStrategy
{
    public String getLabelName();

    public double compute(BasicStatsModel model);
}
