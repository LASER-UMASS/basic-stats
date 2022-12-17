package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

import model.BasicStatsModel;
import gui.view.View;


public class UndoViewController implements View
{
    public static final String UNDO_LABEL_NAME = "Undo";
    public static final String UNDO_ALLOWED = UNDO_LABEL_NAME + " is allowed.";
    public static final String UNDO_DISALLOWED = UNDO_LABEL_NAME + " is disallowed.";
    
    private BasicStatsGUI gui;
    
    /* package */ JButton undoButton;

    
    public UndoViewController(BasicStatsGUI gui, JPanel jpInput) {
	this.gui = gui;
	undoButton = new JButton(UNDO_LABEL_NAME);
	undoButton.setEnabled(false);
	
	jpInput.add(undoButton);
	
	undoButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		    gui.undo();
		}
	    });
    }

    public void update(BasicStatsModel model) {
	// If the list of numbers is empty, the undo is not allowed
	if (model.getArrayDouble().length == 0) {
	    undoButton.setEnabled(false);
	}
	// If the list of numbers is non-empty, the undo is allowed
	else {
	    undoButton.setEnabled(true);
	}
    }

    public String getStringValue() {	
	// This is a snapshot of the current value to support
	// testability and debuggability without breaking the encapsulation.
	if (undoButton.isEnabled() == true) {
	    return UNDO_ALLOWED;
	}
	else {
	    return UNDO_DISALLOWED;
	}
    }
}
