package ch.fhnw.module06.ab2;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Starter extends javafx.application.Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Parent rootPane = new ApplicationUI();
		Scene myScene = new Scene(rootPane);
		
		primaryStage.setTitle("JavaFX App");
		primaryStage.setScene(myScene);
		primaryStage.setWidth(300);
		primaryStage.setHeight(330);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
