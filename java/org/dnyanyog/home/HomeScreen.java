package org.dnyanyog.home;

import java.io.IOException;

import org.dnyanyog.common.StageFactory;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class HomeScreen {
	
	public void show() {
		StageFactory.getStage().setTitle("Customer Login");
		Parent actorGroup=null;
		try { //Error Handling
			actorGroup = FXMLLoader.load(getClass().getResource("/HomeScreen.fxml"));
		} catch (IOException e) {
			System.out.println("Error While opening HomeScreen.fxml. Closing Application");
			e.printStackTrace();
			System.exit(0);
		}
		Scene scene = new Scene(actorGroup,600,400);
		StageFactory.getStage().setScene(scene);
		StageFactory.getStage().show();
		
	}

}
