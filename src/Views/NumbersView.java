import java.util.ArrayList;

import javax.swing.JTextArea;
import javax.swing.text.JTextComponent;


public class NumbersView implements View {

	//Instance variables
	JTextArea jtaNumbers;
	String name;

	public NumbersView() {
		jtaNumbers = new JTextArea(10,50);
    jtaNumbers.setEditable(false);
    name = "Numbers";
	}

	@Override
	public void update(ArrayList<Double> numbers) {
		jtaNumbers.setText("");
		for (Double num: numbers) {
			jtaNumbers.append(num + ",");
		}

	}

	@Override
	public void reset() {
		jtaNumbers.setText("");
	}

	@Override
	public JTextComponent show() {
		return jtaNumbers;
	}

	@Override
	public String getName() {
		return name;
	}

}
