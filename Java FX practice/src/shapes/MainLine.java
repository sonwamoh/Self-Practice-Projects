package shapes;
	
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Line;
import javafx.stage.Stage;


public class MainLine extends Application {	
	private final static String title = "Line";
	public void start(Stage primaryStage) {
		try {
			
			Line line = new Line();
			
			line.setStartX(100);
			line.setStartY(100);
			
			line.setEndX(500);
			line.setEndY(150);
			
			Group root = new Group(line);
			
			Scene scene = new Scene(root, 600, 400);
			
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
