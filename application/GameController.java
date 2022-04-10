package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class GameController {

	/**
	 * ========================== FOR HELP MENU
	 */

	@FXML
	private Button backButton;

	@FXML
	void backButtonClicked(ActionEvent event) {

		try {
			// changeScene("HelpMenu.fxml", event);

			Parent root = FXMLLoader.load(getClass().getResource("Game.fxml"));
			Scene scene = new Scene(root);
			Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			stage.setScene(scene);
		} catch (IOException e) {
			System.out.println("Failed to change scene to 'MainMenu.fxml'");
			// e.printStackTrace();
		}
	}

//    @FXML
//    private Button backButton;
//
//    @FXML
//    void backButtonClicked(ActionEvent event) {
//    	try {
//			//changeScene("HelpMenu.fxml", event);
//			
//			Parent root = FXMLLoader.load(getClass().getResource("Game.fxml"));
//			Scene scene = new Scene(root);
//			Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//			stage.setScene(scene);
//		} catch (IOException e) {
//			System.out.println("Failed to change scene to 'Game.fxml'");
//			//e.printStackTrace();
//		}
//    	
//    }    
	
	

	/**
	 * ========================== FOR MAIN GAME CONTROLLER
	 */
	@FXML
	private Button testButton;

	@FXML
	private TextArea testTextField;

	@FXML
	private Button testSubmitInputButton;

	@FXML
	private Label testOutputLabel;

	@FXML
	private Button helpButton;

	@FXML
	private Button exitGameButton;

	@FXML
	private Button deckDiscardCardButton;

	@FXML
	private ImageView deck00;

	@FXML
	private ImageView deck44;

	@FXML
	private ImageView deck13;

	@FXML
	private ImageView deck01;

	@FXML
	private ImageView deck10;

	@FXML
	private ImageView deck32;

	@FXML
	private ImageView deck21;

	@FXML
	private ImageView deck53;

	@FXML
	private Label handCardSelectionName;

	@FXML
	private ImageView handCardImage;

	@FXML
	private TextArea handSelectionDescription;

	@FXML
	private Button handPlayCardButton;

	@FXML
	private Button handDiscardButton;

	@FXML
	private Label handCard1Name;

	@FXML
	private ImageView handCard1Image;

	@FXML
	private Label handCard1Stat1;

	@FXML
	private Label handCard1Stat2;

	@FXML
	private Label handCard1Stat3;

	@FXML
	private Label handCard2Name;

	@FXML
	private ImageView handCard2Image;

	@FXML
	private ImageView handCard3Image;

	@FXML
	private ImageView handCard4Image;

	@FXML
	void deckDiscardButton(ActionEvent event) {
		testOutputLabel.setText("DECK DISCARD BUTTON SELECTED");
	}

	@FXML
	void exitGameButtonClicked(ActionEvent event) {
		System.exit(0);
	}

	@FXML
	void handCard1Clicked(MouseEvent event) {
		testOutputLabel.setText("HAND CARD 1 SELECTED");

	}

	@FXML
	void handCard2Clicked(MouseEvent event) {
		testOutputLabel.setText("HAND CARD 2 SELECTED");

	}

	@FXML
	void handCard3Clicked(MouseEvent event) {
		testOutputLabel.setText("HAND CARD 3 SELECTED");

	}

	@FXML
	void handCard4Clicked(MouseEvent event) {
		testOutputLabel.setText("HAND CARD 4 SELECTED");

	}

	@FXML
	void handDiscardButton(ActionEvent event) {
		testOutputLabel.setText("HAND DISCARD BUTTON SELECTED");

	}

	@FXML
	void handPlayCardButton(ActionEvent event) {
		testOutputLabel.setText("PLAY CARD BUTTON SELECTED");

	}

	@FXML
	void helpButtonClicked(ActionEvent event) {

		try {
			// changeScene("HelpMenu.fxml", event);

			Parent root = FXMLLoader.load(getClass().getResource("HelpMenu.fxml"));
			Scene scene = new Scene(root);
			Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			stage.setScene(scene);
		} catch (IOException e) {
			System.out.println("Failed to change scene to 'HelpMenu.fxml'");
			// e.printStackTrace();
		}
	}
}
