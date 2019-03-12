package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.Scanner;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage)/* throws IOException*/ {
		try {
			/*File x1 = new File("Grades1.csv"), x2 = new File("Grades2.csv");
			Scanner sc1 = new Scanner(x1), sc2 = new Scanner(x2);
			while(sc1.hasNext()) {
				System.out.println(sc1.next());
			}
			sc1.close();
			System.out.println("\n");
			while(sc2.hasNext()) {
				System.out.println(sc2.next());
			}
			sc2.close();*/
			Parent root = FXMLLoader.load(getClass().getResource("/application/Sample.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			//System.out.println("Error");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
