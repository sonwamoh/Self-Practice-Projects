package animation;
	
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;


public class MainAnimationRectangle extends Application {	
	private final static String title = "Rectangle";
	public void start(Stage primaryStage) {
		try {
			Rectangle shape = constructRectangle();
			RotateTransition rt = new RotateTransition();
			rt.setNode(shape);
			rt.setDuration(Duration.millis(2000));
			rt.setByAngle(360);
			rt.setCycleCount(10);
			
			rt.play();
			
			Group root = new Group(shape);
			
			Scene scene = new Scene(root, 400, 600);
			primaryStage.setScene(scene);
			primaryStage.setTitle(title);
			primaryStage.show();
			
			
		}	catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private Rectangle constructRectangle() {
		Rectangle rec = new Rectangle();
		rec.setX(100);
		rec.setY(150);
		rec.setWidth(200);
		rec.setHeight(100);
		rec.setFill(Color.YELLOW);
		return rec;
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
