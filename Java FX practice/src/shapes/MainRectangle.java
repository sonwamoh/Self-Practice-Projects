package shapes;
	
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class MainRectangle extends Application {	
	private final static String title = "Rectangle";
	public void start(Stage primaryStage) {
		try {
			Rectangle shape = new Rectangle();
			
			shape.setX(100);
			shape.setY(150);
			
			shape.setWidth(200);
			shape.setHeight(100);
			
			shape.setFill(Color.AQUA);
			
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
