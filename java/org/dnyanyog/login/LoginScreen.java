package org.dnyanyog.login;

import org.dnyanyog.common.StageFactory;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class LoginScreen {
	
	public void show() throws Exception {
		StageFactory.getStage().setTitle("Customer Login");
		Parent actorGroup = FXMLLoader.load(getClass().getResource("/Login.fxml"));
		
		Scene scene = new Scene (actorGroup,600,400);
		StageFactory.getStage().setScene(scene);
		StageFactory.getStage().show();
	
	}

}
