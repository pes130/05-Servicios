package es.cursojavafx.demoservicios;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class DemoServiciosApp extends Application {
	@Override
	public void start(Stage primaryStage) {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("DemoServiciosApp.fxml"));
		try {
			Parent root = fxmlLoader.load();
			Scene scene = new Scene(root);
			primaryStage.setTitle("Demo de servicios");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
