import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JTextField;
import javax.swing.text.JTextComponent;


public class ModeView implements View {

  double mode;
  JTextField jtfMode;
  String name;

  public ModeView() {
    mode = 0;
    jtfMode = new JTextField(5);
    jtfMode.setEditable(false);
    name = "Mode";
  }

  @Override
	public void update(ArrayList<Double> numbers) {
		mode = BasicStats.mode(BasicStats.getArrayDouble(numbers));

    //Set text
    jtfMode.setText("" + mode);

	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		jtfMode.setText("");
	}

	@Override
	public JTextComponent show() {
		// TODO Auto-generated method stub
		return jtfMode;

	}

	public String getName() {
		return name;
	}

	public double getMode() {
		return mode;
	}

}
