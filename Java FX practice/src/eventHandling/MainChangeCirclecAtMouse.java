package eventHandling;
	
import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


public class MainChangeCirclecAtMouse extends Application {	
	private final static String title = "Circle";
	public void start(Stage primaryStage) {
		try {
			//Event Handler
			Circle shape = constructCircle();
			shape.addEventFilter(MouseEvent.MOUSE_CLICKED, e -> shape.setFill(Color.BLUE));
			
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
		cir.setFill(Color.RED);
		cir.setCursor(Cursor.HAND);
		return cir;
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
