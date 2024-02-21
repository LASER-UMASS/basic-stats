import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

public class maxView implements View{

    //Instance variables
    double max;
    String name;
    JTextField jtfMax;

    public maxView(){
        max = 0;
        name = "maxName";
        jtfMax = new JTextField(5);
		jtfMax.setEditable(false);
    }

    @Override
    public void update(ArrayList<Double> numbers) {
        // TODO Auto-generated method stub
        max = BasicStats.max(BasicStats.getArrayDouble(numbers));
        jtfMax.setText("" + max);
    }

    @Override
    public void reset() {
        // TODO Auto-generated method stub
        jtfMax.setText("");
    }

    @Override
    public JTextComponent show() {
        // TODO Auto-generated method stub
        return jtfMax;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return name;
    }

    public double getMin(){
        return max;
    }

}