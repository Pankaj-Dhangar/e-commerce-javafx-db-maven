package org.dnyanyog.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.dnyanyog.common.SqlConnection;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SearchScreenController extends SqlConnection {
	@FXML
	TextField searchUser;
	
	@FXML
	Label errorMessage;
	
	public void searchButtonClick() throws Exception {
		Connection connection = DriverManager.getConnection(url,username,pass);
		Statement statement = connection.createStatement();
		String query = "SELECT * FROM  e_commerce.user WHERE userName = '" + searchUser.getText() + "';";

		ResultSet result = statement.executeQuery(query);
		
		if(result.next()) {
			this.errorMessage.setText("User Found Successfully !!");
		}else {
			this.errorMessage.setText("Error To Serach User !!");
		}
	}
	public void backButtonClick() throws Exception {
		new UserScreen().show();
	}
}
