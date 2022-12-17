package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.BasicStatsModel;
import gui.view.View;


public class AddNumberViewController implements View
{
    private BasicStatsGUI gui;
    
    /** The 'Add number' view/controller allows the user to input a number */
    private JTextField jtfNumber;
    /* package */ JButton jbAdd;

    
    public AddNumberViewController(BasicStatsGUI gui, JPanel jpInput) {
	this.gui = gui;
	jtfNumber = new JTextField(5);
	jbAdd = new JButton("Add number");

	jpInput.add(jtfNumber);
	jpInput.add(jbAdd);
	
	jbAdd.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		    // Parse input and add number to the ArrayList	    
		    Double num = Double.parseDouble(jtfNumber.getText());
		    gui.addNumber(num);
		}
	    });
    }

    public void update(BasicStatsModel model) {
	jtfNumber.setText("");
    }

    public String getStringValue() {	
	// This is a snapshot of the current value to support
	// testability and debuggability without breaking the encapsulation.
	return jtfNumber.getText();
    }
}
