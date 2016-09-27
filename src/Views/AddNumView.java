import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

public class AddNumView implements View {

	//Instance variables
	JTextField jtfNumber;
	JButton jbAdd;
	ArrayList<Controller> controllers;

	public AddNumView() {
		controllers = new ArrayList<Controller>();

		jtfNumber = new JTextField(5);

		jbAdd = new JButton("Add number");
		jbAdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				for (Controller ctrl: controllers) {
					ctrl.updateModels(Double.parseDouble(jtfNumber.getText()));
				}

			}

		});
	}

	@Override
	public void update(ArrayList<Double> numbers) {
		jtfNumber.setText("");
	}

	@Override
	public void reset() {
		jtfNumber.setText("");
	}

	@Override
	public JTextComponent show() {
		return jtfNumber;
	}

	@Override
	public String getName() {
		return "Add Num View";
	}

	public void addController(Controller ctrl) {
		controllers.add(ctrl);
	}

	public JButton getButton() {
		return jbAdd;
	}



}
