package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainMenuController {

   /* @FXML
    private Button newGameButton;

    @FXML
    private Button loadButton;

    @FXML
    private Button helpButton;
    
    */
	
	 @FXML
	  public Button newGameButton;

	 @FXML
	  public Button loadButton;

	 @FXML
	  public Button helpButton;

    @FXML
    void helpButtonClicked(ActionEvent event) {
    	try {
			//changeScene("HelpMenu.fxml", event);
			
			Parent root = FXMLLoader.load(getClass().getResource("HelpMenu.fxml"));
			Scene scene = new Scene(root);
			Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			stage.setScene(scene);
		} catch (IOException e) {
			System.out.println("Failed to change scene to 'HelpMenu.fxml'");
			//e.printStackTrace();
		}
	
    }

    @FXML
    void loadButtonClicked(ActionEvent event) {

    }

    @FXML
    void newGameButtonClicked(ActionEvent event) {
    	try {
			//changeScene("HelpMenu.fxml", event);
			
			Parent root = FXMLLoader.load(getClass().getResource("Game.fxml"));
			Scene scene = new Scene(root);
			Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			stage.setScene(scene);
		} catch (IOException e) {
			System.out.println("Failed to change scene to 'Game.fxml'");
			//e.printStackTrace();
		}
    }

}
