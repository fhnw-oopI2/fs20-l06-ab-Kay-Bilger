package ch.fhnw.module06.ab2;


import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class ApplicationUI extends VBox {

	private Button button;
	private Label label;
	private TextField textField;
	private TextArea textArea;
	private Insets labelInsets;
	private Insets textInsets;
	private Insets buttonInsets;

	
	
	public ApplicationUI() {
		initializeControls();
		layoutControls();
	}
	
	private void initializeControls() {
		this.button = new Button("ein Button");
		this.label = new Label("ein Label");
		this.textField = new TextField("text field");
		this.textArea = new TextArea("text area");
		this.labelInsets = new Insets(5,10,0,10);
		this.textInsets = new Insets(0,10,0,10);
		this.buttonInsets = new Insets(0,10,20,10);


	}

	private void layoutControls() {
		this.getChildren().add(label);
		setMargin(label, labelInsets);
		this.getChildren().add(textField);
		setMargin(textField, textInsets);
		this.getChildren().add(textArea);
		setMargin(textArea, textInsets);
		this.getChildren().add(button);
		setMargin(button, buttonInsets);
		
	}
}