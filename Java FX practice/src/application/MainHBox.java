package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class MainHBox extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			HBox hbox = new HBox();
			hbox.setStyle("-fx-background-color: cyan;");
			hbox.setSpacing(10);
			hbox.setPadding(new Insets(20,20,20,20));
			
			Button catBtn = new Button("Cat");
			catBtn.setPrefWidth(75);
			
			Button dogBtn = new Button("Dog");
			dogBtn.setPrefWidth(75);
			
			hbox.getChildren().addAll(catBtn, dogBtn);
			
			
			
			
			Scene scene = new Scene(hbox,400,400);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
