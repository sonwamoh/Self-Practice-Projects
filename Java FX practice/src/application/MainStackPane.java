package application;
	

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class MainStackPane extends Application {
	private final static String title = "StackPane";
	@Override
	public void start(Stage primaryStage) {
		try {
			
			StackPane root = new StackPane();
			root.setStyle("-fx-background-color: cyan;");
			root.setPadding(new Insets(20,20,20,20));
			
			Image img = new Image(getClass().getResourceAsStream("/resources/gsn.png"));
			ImageView imgView = new ImageView(img);
			
			Button clickMe = new Button("Click Me");
			clickMe.setPrefWidth(125);
			clickMe.setPrefHeight(30);	
			clickMe.setFont(new Font("Arial", 20));
			
			root.getChildren().addAll(imgView, clickMe);
			
			Scene scene = new Scene(root,img.getWidth(),img.getHeight());
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
