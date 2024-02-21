import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

public class MinView implements View{

    //Instance variables
    double min;
    String name;
    JTextField jtfMin;

    public MinView(){
        min = 0;
        name = "minName";
        jtfMin = new JTextField(5);
		jtfMin.setEditable(false);
    }

    @Override
    public void update(ArrayList<Double> numbers) {
        // TODO Auto-generated method stub
        min = BasicStats.min(BasicStats.getArrayDouble(numbers));
        jtfMin.setText("" + min);
    }

    @Override
    public void reset() {
        // TODO Auto-generated method stub
        jtfMin.setText("");
    }

    @Override
    public JTextComponent show() {
        // TODO Auto-generated method stub
        return jtfMin;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return name;
    }

    public double getMin(){
        return min;
    }

}