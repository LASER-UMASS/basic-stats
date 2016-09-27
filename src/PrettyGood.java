import java.util.*;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class PrettyGood {

		// Store all collected numbers
    private static ArrayList<Double> data = new ArrayList<Double>();

    public static void main(String ... args) {

      //Initialize controllers
    	AddNumCtrl numCtrl = new AddNumCtrl();
    	ResetCtrl resetCtrl = new ResetCtrl();

    	//Initialize model
    	Numbers numbers = new Numbers();

    	//Initialize views
    	CountView countView = new CountView();
    	MeanView meanView = new MeanView();
    	MedianView medianView = new MedianView();
      ModeView modeView = new ModeView();
    	NumbersView numbersView = new NumbersView();
    	AddNumView addNumView = new AddNumView();
    	ResetView resetView = new ResetView();

    	//Create statsView
    	ArrayList<View> statsViews = new ArrayList<View>();
    	statsViews.add(countView);
    	statsViews.add(medianView);
    	statsViews.add(meanView);
      statsViews.add(modeView);

    	/***** REGISTER MVC BLOCK *****/

    	//Register models to controls
    	numCtrl.addModel(numbers);
    	resetCtrl.addModel(numbers);

    	//Register views to models
    	for (View view: statsViews) {
    		numbers.addObserver(view);
    	}
    	numbers.addObserver(numbersView);
    	numbers.addObserver(addNumView);
    	numbers.addObserver(resetView);

    	//Register controls to views
    	addNumView.addController(numCtrl);
    	resetView.addController(resetCtrl);

    	/***** END OF REGISTER MVC BLOCK *****/

      // Create the main frame of the application, and set size and position
      JFrame jfMain = new JFrame("Simple stats");
      jfMain.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
      jfMain.setSize(1000,900);
      jfMain.setLocationRelativeTo(null);

      // Panel that shows stats about the numbers
      JPanel jpStats = new JPanel(new FlowLayout(FlowLayout.CENTER));

      for (View view: statsViews) {
      	jpStats.add(new JLabel(view.getName() + ":"));
      	jpStats.add(view.show());
      }

      //Set stats view
      jfMain.getContentPane().add(jpStats, BorderLayout.CENTER);

      // TextArea that shows all the numbers
      jfMain.getContentPane().add(numbersView.show(), BorderLayout.SOUTH);

      //Create panel for input
      JPanel jpInput = new JPanel(new FlowLayout(FlowLayout.CENTER));
      jpInput.add(addNumView.show());
      jpInput.add(addNumView.getButton());
      jpInput.add(resetView.getButton());

      //Set input view
      jfMain.getContentPane().add(jpInput, BorderLayout.NORTH);

      // Show the frame
      jfMain.setVisible(true);

	}

}
