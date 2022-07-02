package shapes;
	
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


public class MainCircle extends Application {	
	private final static String title = "Circle";
	public void start(Stage primaryStage) {
		try {
			Circle shape = new Circle();
			shape.setCenterX(200);
			shape.setCenterY(150);
			shape.setRadius(100);
			shape.setFill(Color.RED);
			
			
			
			
			Group root = new Group(shape);
			
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
