package shapes;
	
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.stage.Stage;


public class MainComplex extends Application {	
	private final static String title = "ComplexShape";
	public void start(Stage primaryStage) {
		try {
			
			MoveTo startPoint = new MoveTo(108, 71);
			LineTo line1 = new LineTo(321, 161);
			LineTo line2 = new LineTo(126, 232);
			LineTo line3 = new LineTo(232, 52);
			LineTo line4 = new LineTo(269, 250);
			LineTo line5 = new LineTo(108, 71);
			Path path = new Path();
			path.getElements().addAll(startPoint, line1,line2,line3,line4,line5);

			
			Group root = new Group(path);
			
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
