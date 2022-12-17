package gui;

import java.util.*;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

import model.BasicStatsModel;
import gui.view.CountView;
import gui.view.MeanView;
import gui.view.MedianView;
import gui.view.MaximumView;
import gui.view.NumbersView;
import gui.view.View;


/**
 * Create a simple GUI that includes:
 * - a text field and a button that allows the user to enter numbers.
 * - a button that allows the user to clear all entered numbers.
 * - a panel with labels and text fields for count, median, and mean.
 * - a text area that shows all numbers.
 *
 * For the MVC architecture pattern, these are the views and controllers.
 */
public class BasicStatsGUI implements View
{
    public static final String APP_TITLE = "Simple stats";
    
    private BasicStatsModel model = new BasicStatsModel();
    /** The GUI is applying the Composite design pattern */
    private java.util.List<View> views = new ArrayList<View>();
    private JFrame jfMain = new JFrame(APP_TITLE);

    public BasicStatsGUI() {	
	// Create the main frame of the application, and set size and position
	jfMain.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	jfMain.setSize(600,400);
	jfMain.setLocationRelativeTo(null);
	
	// Panel that shows stats about the numbers
	JPanel jpStats = new JPanel(new FlowLayout(FlowLayout.CENTER));
	CountView countView = new CountView(jpStats);
	addView(countView);
	MedianView medianView = new MedianView(jpStats);
	addView(medianView);
	MeanView meanView = new MeanView(jpStats);
	addView(meanView);
	MaximumView maximumView = new MaximumView(jpStats);
	addView(maximumView);
	jfMain.getContentPane().add(jpStats, BorderLayout.CENTER);
	
	// TextArea that shows all the numbers
	NumbersView numbersView = new NumbersView(jfMain);
	addView(numbersView);
	
	// Panel with a text field/button to enter numbers and a button to reset the application
	JPanel jpInput = new JPanel(new FlowLayout(FlowLayout.CENTER));

	AddNumberViewController addNumberViewController = new AddNumberViewController(this, jpInput);
	addView(addNumberViewController);

	UndoViewController undoViewController = new UndoViewController(this, jpInput);
	addView(undoViewController);
	
	JButton jbReset = new JButton("Reset");
	jbReset.addActionListener(new ActionListener() {
		// The interface ActionListener defines a call-back method actionPerformed,
		// which is invoked if the user interacts with the GUI component -- in this
		// case, if the user clicks the button.
		public void actionPerformed(ActionEvent e) {
		    reset();
		}
	    });
	jpInput.add(jbReset);
	
	
	jfMain.getContentPane().add(jpInput, BorderLayout.NORTH);
    }

    public double[] getArrayDouble() {
	return model.getArrayDouble();
    }
    
    public void addView(View view) {
	// For the Composite design pattern, add a non-null component
	if (view != null) {
	    views.add(view);
	}
    }

    public void removeView(View view) {
	// For the Composite design pattern, remove a non-null component
	if (view != null) {
	    views.remove(view);
	}
    }

    public int numberOfViews() {
	// This supports testability.
	return views.size();
    }

    private void updateUndoButton() {

    }

    public void addNumber(double num) {
	model.addNumber(num);

	update(model);
    }

    public void undo() throws UnsupportedOperationException
    {
	// Remove the last number added if it is currently allowed
	model.undo();

	update(model);
    }
    
    public void reset() {
	// Clear the ArrayList and all text fields
	model.reset();
	
	update(model);
    }

    public void update(BasicStatsModel model) {
	// For the Composite design pattern, iterate calling each non-null component.
	for (View currentView : views) {
	    currentView.update(model);
	}
    }

    public String getStringValue() {
	java.util.List<String> stringValueList = new ArrayList<String>();

	// Iterate calling each non-null component
	for (View currentView : views) {
	    stringValueList.add(currentView.getStringValue());
	}

	return stringValueList.toString();
    }

    public void show() {
	// Show the frame
	jfMain.setVisible(true);
    }
    
}
