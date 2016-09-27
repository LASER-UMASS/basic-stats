import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

//View for count of numbers
public class CountView implements View {

	//Instance variables
	int count;
	JTextField jtfCount;
	String name;

	public CountView() {
		count = 0;
		jtfCount = new JTextField(5);
		jtfCount.setEditable(false);
		name = "Numbers";
	}

	@Override
	public void update(ArrayList<Double> numbers) {
		count = numbers.size();

    jtfCount.setText("" + count);

	}

	@Override
	public void reset() {
		jtfCount.setText("");
	}

	@Override
	public JTextComponent show() {
		return jtfCount;

	}

	@Override
	public String getName() {
		return name;
	}

	public int getCount() {
		return count;
	}

}
