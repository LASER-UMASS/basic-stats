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
    private BasicStatsModel model;
    private BasicStatsGUI gui;
    
    /** The 'Add number' view/controller allows the user to input a number */
    private JTextField jtfNumber;
    /* package */ JButton jbAdd;

    
    public AddNumberViewController(BasicStatsModel model, BasicStatsGUI gui, JPanel jpInput) {
	this.model = model;
	this.gui = gui;
	jtfNumber = new JTextField(5);
	jbAdd = new JButton("Add number");

	jpInput.add(jtfNumber);
	jpInput.add(jbAdd);
	
	jbAdd.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		    // Parse input and add number to the ArrayList
		    
		    Double num = Double.parseDouble(jtfNumber.getText());
		    model.addNumber(num);
		    
		    gui.update(model);
		}
	    });
    }

    public void update(BasicStatsModel model) {
	// Reset
	if (model.getArrayDouble().length == 0) {
	    jtfNumber.setText("");
	}
    }
}
