package gui.view;

import model.BasicStatsModel;


/**
 * The View interface represents a visualization of the BasicStatsModel.
 * This interface supports the MVC architecture pattern.
 * The interface also supports the Composite design pattern.
 * The View is the Component.
 */
public interface View
{    
    /**
     * Updates this View to visualize the current BasicStatsModel.
     *
     * @param model The current BasicStatsModel to be visualized
     */
    public void update(BasicStatsModel model);

    /**
     * Returns the String value of this View.
     *
     * NOTE) This supports testability and debuggability.
     *
     * @return The String value of this View
     */
    public String getStringValue();
}
