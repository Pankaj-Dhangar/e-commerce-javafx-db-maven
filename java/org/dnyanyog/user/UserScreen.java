package org.dnyanyog.user;

import java.io.IOException;

import org.dnyanyog.common.StageFactory;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class UserScreen {

	public void show() throws IOException {
		StageFactory.getStage().setTitle("Customer Login");
		Parent actorGroup = FXMLLoader.load(getClass().getResource("/UserOptionScreen.fxml"));

		Scene scene = new Scene(actorGroup, 600, 400);
		StageFactory.getStage().setScene(scene);
		StageFactory.getStage().show();

	}

// Add User Screen
	public void AddUserScreen() throws IOException {
		StageFactory.getStage().setTitle("Add User");
		Parent actorGroup = FXMLLoader.load(getClass().getResource("/AddUserScreen.fxml"));

		Scene scene = new Scene(actorGroup, 600, 400);
		StageFactory.getStage().setScene(scene);
		StageFactory.getStage().show();

	}

// SearchUser Screen
	public void SearchUserScreen() throws IOException {
		StageFactory.getStage().setTitle("Search User");
		Parent actorGroup = FXMLLoader.load(getClass().getResource("/SearchUserScreen.fxml"));

		Scene scene = new Scene(actorGroup, 600, 400);
		StageFactory.getStage().setScene(scene);
		StageFactory.getStage().show();

	}

	// RemoveUser Screen
	public void RemoveUserScreen() throws IOException {
		StageFactory.getStage().setTitle("Remove user");
		Parent actorGroup = FXMLLoader.load(getClass().getResource("/RemoveUserScreen.fxml"));

		Scene scene = new Scene(actorGroup, 600, 400);
		StageFactory.getStage().setScene(scene);
		StageFactory.getStage().show();

	}

// UpdateUser Screen

	public void UpdateUserScreen() throws IOException {
		StageFactory.getStage().setTitle("Update User");
		Parent actorGroup = FXMLLoader.load(getClass().getResource("/UpdateUserScreen.fxml"));

		Scene scene = new Scene(actorGroup, 600, 400);
		StageFactory.getStage().setScene(scene);
		StageFactory.getStage().show();

	}

}
