package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SampleController {
	
	@FXML
	private Label fileSourceLabel, averageLabel;
	
	@FXML
	public void close(ActionEvent event) { //exits the app
		Platform.exit();
		System.exit(0);
	}
	
	@FXML
	public void about(ActionEvent event) {
		fileSourceLabel.setText("This application was created by Ivan Williams, a Farmingdale State College student.");
		averageLabel.setText("");
	}
	
	@FXML
	public void openGrades1(ActionEvent event) {
		try {
			File x = new File("Grades1.csv"); //file object retrieves the file
			Scanner sc = new Scanner(x); //for reading the file
			sc.useDelimiter(","); //sets the delimiter to a comma
			int count = 0;
			double sum = 0, average = 0;
			String grades = "";
			while(sc.hasNextLine()) { //loops once per line
				String line = sc.nextLine(); //retrieves a line from the file
				String[] grade = line.split(","); //splits the string based on the comma
				for(int i = 0; i < grade.length; i++) { //runs at the same amount as the length of the string array
					grades += grade[i] + "\t"; //adds the element into the string object following a tab
					sum += Double.parseDouble(grade[i]); //coverts the string element into a double value then adds it into the sum variable
					count++;
				}
				grades += "\n";
			}
			fileSourceLabel.setText(grades);
			average = sum/count; //calculates the average
			averageLabel.setText("" + average);
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error");
		}
	}
	
	@FXML
	public void openGrades2(ActionEvent event) {
		try {
			File x = new File("Grades2.csv");
			Scanner sc = new Scanner(x);
			sc.useDelimiter(",");
			int count = 0;
			double sum = 0, average = 0;
			String grades = "";
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				String[] grade = line.split(",");
				for(int i = 0; i < grade.length; i++) {
					grades += grade[i] + "\t";
					sum += Double.parseDouble(grade[i]);
					count++;
				}
				grades += "\n";
			}
			fileSourceLabel.setText(grades);
			average = sum/count;
			averageLabel.setText("" + average);
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error");
		}
	}
}
