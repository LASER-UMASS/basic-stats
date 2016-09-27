import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JTextField;
import javax.swing.text.JTextComponent;


public class MedianView implements View {

	//Instance variables
	double median;
	JTextField jtfMedian;
	String name;

	public MedianView() {
		median = 0;
		jtfMedian = new JTextField(5);
		jtfMedian.setEditable(false);
		name = "Median";
	}

	@Override
	public void update(ArrayList<Double> numbers) {
		median = BasicStats.median(BasicStats.getArrayDouble(numbers));

		//Set text
		jtfMedian.setText("" + median);

	}

	@Override
	public void reset() {
		jtfMedian.setText("");
	}

	@Override
	public JTextComponent show() {
		return jtfMedian;
	}

	@Override
	public String getName() {
		return name;
	}

	public double getMedian() {
		return median;
	}

}
