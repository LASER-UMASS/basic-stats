import java.util.ArrayList;


public interface Model {

	public void addObserver(View view);
	public void updateViews();

	//Taking an ArrayList allows for data to be read in from this kind of data structure
	public void update(ArrayList<Double> information);

	//addData allows for single data point to be added from any source
	public void addData(Double data);

	//returns data as ArrayList
	public ArrayList<Double> getData();

}
