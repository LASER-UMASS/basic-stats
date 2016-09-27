import java.util.ArrayList;

import javax.swing.JTextArea;
import javax.swing.text.JTextComponent;


public class NumbersView implements View {

	JTextArea jtaNumbers;
	String name;

	public NumbersView() {
		jtaNumbers = new JTextArea(10,50);
    jtaNumbers.setEditable(false);
    name = "Numbers";
	}

	@Override
	public void update(ArrayList<Double> numbers) {
		// TODO Auto-generated method stub
		jtaNumbers.setText("");
		for (Double num: numbers) {
			jtaNumbers.append(num + ",");
		}

	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		jtaNumbers.setText("");
	}

	@Override
	public JTextComponent show() {
		// TODO Auto-generated method stub
		return jtaNumbers;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
