package ch.fhnw.module06.ab3;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;

public class ApplicationUI extends BorderPane{

	private Button topButton;
	private Button leftButton;
	private Button rightButton;
	private Button bottomButton;
	private TextArea textArea;
	private Insets topBottomInsets;
	private Insets leftRightInsets;

	
	
	public ApplicationUI() {
		initializeControls();
		layoutControls();
	}
	
	private void initializeControls() {
		this.topButton = new Button("top");
		this.leftButton = new Button("left");
		this.rightButton = new Button("right");
		this.bottomButton = new Button("bottom");
		this.textArea = new TextArea();
		this.topBottomInsets = new Insets(5,5,5,5);
		this.leftRightInsets = new Insets(0,5,0,5);


	}

	private void layoutControls() {
		topButton.setPrefWidth(400);
		setMargin(topButton, topBottomInsets);
		this.setTop(topButton);
		
		bottomButton.setPrefWidth(400);
		setMargin(bottomButton, topBottomInsets);
		this.setBottom(bottomButton);
		
		setMargin(leftButton, leftRightInsets);
		this.setLeft(leftButton);
		
		setMargin(rightButton, leftRightInsets);
		this.setRight(rightButton);
		
		this.setCenter(textArea);
		
	}
}