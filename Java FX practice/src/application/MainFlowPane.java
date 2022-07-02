package application;
	

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class MainFlowPane extends Application {
	
	private final static String title = "FlowPane";
	private static Button createButton(String name, double prefW, double prefH) {
		Button btn = new Button(name);
		btn.setPrefWidth(prefW);
		btn.setPrefHeight(prefH);
		return btn;
	}
	
	
	
	
	@Override
	public void start(Stage primaryStage) {
		try {
			Button btn1 = createButton("1", 50, 150);
			Button btn2 = createButton("2", 50, 50);
			Button btn3 = createButton("3", 50, 50);
			Button btn4 = createButton("4", 50, 50);
			Button btn5 = createButton("5", 150,50);
			
			
			FlowPane root = new FlowPane();
			
			root.setOrientation(Orientation.VERTICAL);
			
			root.getChildren().addAll(btn1,btn2,btn3,btn4,btn5);

			root.setStyle("-fx-background-color: cyan;");
			root.setPadding(new Insets(20,20,20,20));
			
			root.setVgap(10);
			root.setHgap(30);

						
			
			Scene scene = new Scene(root, 300, 250);
			primaryStage.setScene(scene);
			primaryStage.setTitle(title);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
