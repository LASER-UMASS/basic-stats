import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.text.JTextComponent;

//View for reset button. Reasoning behind having my own reset view for the reset button is that another
//controller can be added that affects a different view. This allows for flexibility that InputView did not offer.

public class ResetView implements View {

	//Instance variables
	JButton jbReset;
	ArrayList<Controller> controllers;

	public ResetView() {
		controllers = new ArrayList<Controller>();

		jbReset = new JButton("Reset");
		jbReset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				for (Controller ctrl: controllers) {
					ctrl.updateModels(0.0);
				}
			}

		});
	}

	@Override
	public void update(ArrayList<Double> numbers) {

	}

	@Override
	public void reset() {

	}

	@Override
	public JTextComponent show() {
		return null;
	}

	@Override
	public String getName() {
		return "Reset View";
	}

	public void addController(Controller ctrl) {
		controllers.add(ctrl);
	}

	public JButton getButton() {
		return jbReset;
	}


}
