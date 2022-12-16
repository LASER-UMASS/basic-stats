import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import gui.BasicStats;
import gui.BasicStatsGUI;
import model.BasicStatsModel;

public class BasicStatsTest {
    private static double EPS = 1e-9;

    /* The test fixture */
    private BasicStatsModel model;
    private BasicStatsGUI gui;

    @Before
    public void setUp() {
	this.model = new BasicStatsModel();
	this.gui = new BasicStatsGUI();
    }

    @After
    public void tearDown() {
	this.model = null;
	this.gui = null;
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testModelAddNumberInputValidationFails() {
	// Perform setup and check pre-conditions
	Double nullNumber = null;
	assertNotNull(model);
	assertEquals(0, model.getArrayDouble().length);
	assertNull(nullNumber);
	// Call the unit under test
	this.model.addNumber(nullNumber);
	// Check the post-conditions (see @Test)
    }

    protected void checkModelAddNumberPostconditions(double number) {
	assertNotNull(model);
	double[] modelData = model.getArrayDouble();
	assertEquals(1, modelData.length);
	assertEquals(number, modelData[0], EPS);	
    }
    
    @Test
    public void testModelAddNumberInputValidationSucceeds() {
	// Perform setup and check pre-conditions
	double number = 1.0;
	assertNotNull(model);
	assertEquals(0, model.getArrayDouble().length);
	assertNotNull(number);
	// Call the unit under test
	model.addNumber(number);
	// Check the post-conditions
	checkModelAddNumberPostconditions(number);
    }

    @Test
    public void testModelReset() {
	// Perform setup and check pre-conditions
	double number = 1.0;
	assertNotNull(model);
	assertNotNull(number);
	model.addNumber(number);
	checkModelAddNumberPostconditions(number);
	// Call the unit under test
	model.reset();
	// Check the post-conditions
	assertNotNull(model);
	assertEquals(0, model.getArrayDouble().length);
    }

    protected void checkViewInitialPostconditions() {
	assertNotNull(gui);
	List<String> expected = new ArrayList<String>();
	for (int i = 0; i < gui.numberOfViews(); i++) {
	    expected.add("");
	}
	assertEquals(expected.toString(), gui.getStringValue());
    }
    
    @Test
    public void testViewInitialConfiguration() {
	// Perform setup and pre-condition checks
	// (Since this is a constructor there is none.)
	// Call the unit under test (see @Before)
	// Check the post-conditions
	checkViewInitialPostconditions();
    }

    @Test
    public void testViewResetConfiguration() {
	// Perform setup and pre-condition checks
	double num = 3.0;
	gui.addNumber(num);
	double[] modelData = gui.getArrayDouble();
	List<String> expected = new ArrayList<String>();
	expected.add("" + modelData.length);
	expected.add("" + BasicStats.median(modelData));
	expected.add("" + BasicStats.mean(modelData));
	expected.add("" + BasicStats.maximum(modelData));
	expected.add("" + num + ",");
	expected.add("");
	assertEquals(expected.toString(), gui.getStringValue());
	// Call the unit under test
	gui.reset();
	// Check the post-conditions
	checkViewInitialPostconditions();
    }
    
    @Test
    public void testCentralTendency() {
        double[] numbers = {2, 2, 3, 3, 3, 4, 4};
        double mean   = BasicStats.mean(numbers);
        assertEquals (3, mean, EPS);
        double median = BasicStats.median(numbers);
        assertEquals (3, median, EPS);
        double mode   = BasicStats.mode(numbers);
        assertEquals (3, mode, EPS);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testMaximumInputValidationFails1() {
	// Perform setup and check pre-conditions
	double[] nullNumbers = null;
	assertNull(nullNumbers);
	// Call the unit under test
	BasicStats.maximum(nullNumbers);
	// Check the post-conditions (see @Test)
    }

    @Test(expected=IllegalArgumentException.class)
    public void testMaximumInputValidationFails2() {
	// Perform setup and check pre-conditions
	double[] emptyNumbers = {};
	assertNotNull(emptyNumbers);
	assertEquals(0, emptyNumbers.length);
	// Call the unit under test
	BasicStats.maximum(emptyNumbers);
	// Check the post-conditions (see @Test)
    }

    @Test
    public void testMaximumInputValidationSucceeds1() {
	// Perform setup and check pre-conditions
	double[] numbers = { 1.0, 1.0, 2.0, 3.0, 5.0, 8.0, 13.0 };
	assertNotNull(numbers);
	assertTrue(numbers.length > 0);
	// Call the unit under test
	double actual = BasicStats.maximum(numbers);
	// Check the post-conditions
	assertEquals(numbers[numbers.length - 1], actual, EPS);
    }

    @Test
    public void testMaximumInputValidationSucceeds2() {
	// Perform setup and check pre-conditions
	double[] numbers = { 13.0, 8.0, 5.0, 3.0, 2.0, 1.0 };
	assertNotNull(numbers);
	assertTrue(numbers.length > 0);
	// Call the unit under test
	double actual = BasicStats.maximum(numbers);
	// Check the post-conditions
	assertEquals(numbers[0], actual, EPS);
    }    

    @Test
    public void testMedian() {
      //Median should be 8.0 since size is even
      /* double[] numbers = {1, 4, 7, 9, 11, 21}; */
      double[] numbers = {9, 11, 1, 4, 7, 21};

      double median = BasicStats.median(numbers);
      assertEquals(8.0, median, EPS);

      //Median should be 7 since size is odd
      double[] numbers2 = {9, 1, 4, 7, 21};
      median = BasicStats.median(numbers2);
      assertEquals(7, median, EPS);

      //Median should be 3 since size is 1
      double[] numbers3 = {3};
      median = BasicStats.median(numbers3);
      assertEquals(3, median, EPS);

      //Median should be 0 since size is 0
      double[] numbers4 = {};
      median = BasicStats.median(numbers4);
      assertEquals(0, median, EPS);
    }

    @Test
    public void testMode() {
      //Mode should be 1 since we are taking the first mode
      double[] numbers = {1, 4, 7, 9, 11, 21};
      double mode   = BasicStats.mode(numbers);
      assertEquals (1, mode, EPS);

      //Mode should be 4
      double[] numbers2 = {1, 4, 4, 7, 9, 11, 21};
      mode   = BasicStats.mode(numbers2);
      assertEquals (4, mode, EPS);

      //Mode should be 7
      double[] numbers3 = {4, 4, 7, 7, 7, 11, 11};
      mode   = BasicStats.mode(numbers3);
      assertEquals (7, mode, EPS);

      //Mode should be 7
      double[] numbers4 = {7};
      mode   = BasicStats.mode(numbers4);
      assertEquals (7, mode, EPS);

      //Mode should be 0
      double[] numbers5 = {};
      mode   = BasicStats.mode(numbers5);
      assertEquals (0, mode, EPS);
    }
}
