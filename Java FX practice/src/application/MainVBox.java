package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class MainVBox extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			VBox hbox = new VBox();
			hbox.setStyle("-fx-background-color: ;");
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
