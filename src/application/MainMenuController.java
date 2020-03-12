package application;

//Import libraries

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
* Main Menu
* class that allows the user to start the game, proceed to player movement demo
*  or exit the game. 
*/

public class MainMenuController {
	
	/*
	* Press "exit" button to close the window.
	*/
	public void exit(ActionEvent e) {
		Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();
		window.close();
	}
	
	/*
	* Press "Player Movement Demo" button to proceed to movement demo.
	*/
	public void avatarClick(ActionEvent e) {
		CharacterMovement movement = new CharacterMovement();
	    movement.movement();

	}
	
	/*
	* Press "Start" button to proceed with starting the game.
	*/
	public void startClick(ActionEvent e) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/Level1.fxml"));
		Scene gameover=new Scene(root,600,400);
		Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();
		window.setScene(gameover);
		window.show();

	}
}
