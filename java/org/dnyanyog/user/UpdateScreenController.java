package org.dnyanyog.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.dnyanyog.common.SqlConnection;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class UpdateScreenController extends SqlConnection{
	@FXML
	TextField userName;
	
	@FXML
	TextField userPassword;
	
	@FXML
	TextField userMail;
	
	@FXML 
	Label errorMessage;
	
	@FXML
	TextField userId;
	
	public void updateButtonClick() throws Exception {
		Connection connection = DriverManager.getConnection(url,username,pass);
		Statement statement = connection.createStatement();
		
		String query = "UPDATE e_commerce.user SET userName ='"+ userName.getText() + "'where userId = '"+ userId.getText()+"'";
		String query1 = "UPDATE e_commerce.user SET userPassword ='"+ userPassword.getText() + "'where userId = '"+ userId.getText()+"'";
		String query2 = "UPDATE e_commerce.user SET userMail ='"+ userMail.getText() + "'where userId = '"+ userId.getText()+"'";

		statement.execute(query);
		statement.execute(query1);
		statement.execute(query2);
			this.errorMessage.setText("User Updated");
		
	}
	public void backButtonClick() throws Exception {
		new UserScreen().show();
}
}

