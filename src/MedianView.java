import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JTextField;
import javax.swing.text.JTextComponent;


public class MedianView implements View {

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
	public void update(ArrayList<Integer> numbers) {
		Collections.sort(numbers);

		int count = numbers.size();

    if (count%2 == 0) {
        median = (numbers.get(count >> 1) + numbers.get((count >> 1) - 1)) / 2.;
    } else {
        median = numbers.get(count >> 1);
    }

    //Set text
    jtfMedian.setText("" + median);

	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		jtfMedian.setText("");
	}

	@Override
	public JTextComponent show() {
		// TODO Auto-generated method stub
		return jtfMedian;

	}

	public String getName() {
		return name;
	}

	public double getMedian() {
		return median;
	}

}
