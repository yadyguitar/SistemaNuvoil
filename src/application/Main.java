package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException  {
		Parent mainLayout = FXMLLoader.load(getClass().getResource("/fxml/MainFXML.fxml"));
        Scene scene = new Scene(mainLayout, 1100, 600);
        primaryStage.setTitle("Sistema Nuvoil");
        primaryStage.setScene(scene);
		primaryStage.setMaximized(true);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
