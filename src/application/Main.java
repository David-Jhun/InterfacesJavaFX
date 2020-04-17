
package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;

public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("Informacion de usuario.");
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("PedirInformacion.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);
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
