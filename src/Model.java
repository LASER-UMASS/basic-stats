import java.util.ArrayList;


public interface Model {

	public void addObserver(View view);
	public void updateViews();

	//Taking an ArrayList allows for data to be read in from this kind of data structure
	public void update(ArrayList<Integer> information);

	//addData allows for single data point to be added from any source
	public void addData(Integer data);

	public ArrayList<Integer> getData();

}
