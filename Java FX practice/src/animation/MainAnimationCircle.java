package animation;
	
import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;


public class MainAnimationCircle extends Application {	
	private final static String title = "Circle";
	public void start(Stage primaryStage) {
		try {
			Circle shape = constructCircle();
			ScaleTransition rt = new ScaleTransition();
			rt.setNode(shape);
			rt.setDuration(Duration.millis(2000));
			rt.setByX(-5);  
			rt.setByY(-2); 
			rt.setCycleCount(10);
			
			rt.play();
			
			Group root = new Group(shape);
			
			Scene scene = new Scene(root, 600, 400);
			primaryStage.setScene(scene);
			primaryStage.setTitle(title);
			primaryStage.show();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private Circle constructCircle() {
		Circle cir = new Circle();
		cir.setCenterX(200);
		cir.setCenterY(150);
		cir.setRadius(100);
		cir.setFill(Color.AQUA);
		return cir;
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
