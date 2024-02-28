import java.util.ArrayList;

//Controller for ResetView
public class ResetCtrl implements Controller {

	ArrayList<Model> models;

	public ResetCtrl() {
		models = new ArrayList<Model>();
	}

	@Override
	public void addModel(Model model) {
		models.add(model);
	}

	@Override
	public void updateModels(Double num) {
		//New ArrayList resets model in Numbers.java
		for (Model model: models) {
			model.update(new ArrayList<Double>());
		}
	}

}
