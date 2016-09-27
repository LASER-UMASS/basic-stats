import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

public class AddNumView implements View {

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
					ctrl.updateModels(Integer.parseInt(jtfNumber.getText()));
				}

			}

		});
	}

	@Override
	public void update(ArrayList<Integer> numbers) {
		jtfNumber.setText("");
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		jtfNumber.setText("");
	}

	@Override
	public JTextComponent show() {
		// TODO Auto-generated method stub
		return jtfNumber;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Add Num View";
	}

	public void addController(Controller ctrl) {
		controllers.add(ctrl);
	}

	public JButton getButton() {
		return jbAdd;
	}

}
