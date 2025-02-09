package org.dnyanyog.user;

import org.dnyanyog.home.HomeScreen;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class UserScreenController extends UserScreen {
	
	@FXML
	Button addUser;
	@FXML
	Button searchUser;
	@FXML
	Button removeUser;
	@FXML
	Button updateUser;
	
	
	public void addUserButtonClick() throws Exception {
		new UserScreen().AddUserScreen();
		
	}
	public void removeUserButtonClick() throws Exception {
		new UserScreen().RemoveUserScreen();
		
	}
	public void searchUserButtonClick() throws Exception {
		new UserScreen().SearchUserScreen();
		
	}
	public void updateUserButtonClick() throws Exception {
		new UserScreen().UpdateUserScreen();
	}
	public void backButtonClick() throws Exception {
		new HomeScreen().show();
		return;
	}

}
