import java.util.ArrayList;

//Controller for AddNumView
public class AddNumCtrl implements Controller {

	ArrayList<Model> models;

	public AddNumCtrl() {
		models = new ArrayList<Model>();
	}

	public void addModel(Model model) {
		models.add(model);
	}

	public void updateModels(Integer num) {

		for (Model model: models) {
			model.addData(num);
		}
	}

}
