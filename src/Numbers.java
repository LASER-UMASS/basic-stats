import java.util.ArrayList;

//Model for this assignment
public class Numbers implements Model {

	ArrayList<Integer> numbers;
	ArrayList<View> observers;

	public Numbers() {
		numbers = new ArrayList<Integer>();
		observers = new ArrayList<View>();
	}

	public void addObserver(View view) {
		observers.add(view);
	}

	public void updateViews() {

		for (View view: observers) {
			if (numbers.size() == 0) {
				view.reset();
			}
			else {
				view.update(numbers);
			}
		}
	}

	@Override
	public void update(ArrayList<Integer> information) {
		if (information.size() == 0) {
			numbers = information;
		}
		else {
			numbers.addAll(information);
		}

		updateViews();
	}

	public ArrayList<Integer> getData() {
		return numbers;
	}

	public void addData(Integer num) {
		numbers.add(num);

		updateViews();
	}

}
