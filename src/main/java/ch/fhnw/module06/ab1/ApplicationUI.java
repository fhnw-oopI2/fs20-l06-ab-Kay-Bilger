package ch.fhnw.module06.ab1;

import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ApplicationUI extends javafx.scene.layout.StackPane {

	private Button button;
	
	public ApplicationUI() {
		initializeControls();
		layoutControls();
	}
	
	private void initializeControls() {
		this.button = new Button("Hello World");
	}

	private void layoutControls() {
		this.getChildren().add(button);
	}
}
