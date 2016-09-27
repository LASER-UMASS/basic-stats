import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JTextField;
import javax.swing.text.JTextComponent;


public class MeanView implements View {

	double mean;
	JTextField jtfMean;
	String name;


	public MeanView() {
		mean = 0;
		jtfMean = new JTextField(5);
		jtfMean.setEditable(false);
		name = "Mean";
	}

	@Override
	public void update(ArrayList<Integer> numbers) {

		int count = numbers.size();

		double sum= 0;
    for (Integer value : numbers) {
        sum += value;
    }
    mean = sum / count;

    //Set text
    jtfMean.setText("" + mean);

	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		jtfMean.setText("");
	}

	@Override
	public JTextComponent show() {
		// TODO Auto-generated method stub
		return jtfMean;

	}

	public String getName() {
		return name;
	}

	public double getMean() {
		return mean;
	}

}
