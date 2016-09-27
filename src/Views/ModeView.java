import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JTextField;
import javax.swing.text.JTextComponent;


public class ModeView implements View {

  //Instance variables
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
    jtfMode.setText("");
  }

  @Override
  public JTextComponent show() {
    return jtfMode;
  }

  @Override
  public String getName() {
		return name;
	}

	public double getMode() {
		return mode;
	}




}
