package org.dnyanyog.user;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.dnyanyog.common.SqlConnection;
import org.dnyanyog.home.HomeScreen;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class RemoveScreenController extends SqlConnection {

	@FXML
	TextField removeUser;

	@FXML
	Label errorMessage;

	public void removeUserButtonClick() throws Exception {
		Connection connection = DriverManager.getConnection(url, username, pass);

		Statement statement = connection.createStatement();

		String query = "delete FROM e_commerce.user WHERE userName= '" + removeUser.getText() + "';";
		statement.execute(query);

		this.errorMessage.setText("User Removed");
	}

	public void backButtonClick() throws IOException {
		new UserScreen().show();
	}
}
