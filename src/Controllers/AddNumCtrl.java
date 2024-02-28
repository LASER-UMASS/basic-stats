import java.util.ArrayList;

//Controller for AddNumView
public class AddNumCtrl implements Controller {

	ArrayList<Model> models;

	public AddNumCtrl() {
		models = new ArrayList<Model>();
	}

	@Override
	public void addModel(Model model) {
		models.add(model);
	}

	@Override
	public void updateModels(Double num) {

		for (Model model: models) {
			model.addData(num);
		}
	}

}
