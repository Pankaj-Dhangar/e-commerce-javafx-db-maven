package org.dnyanyog.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.dnyanyog.common.SqlConnection;
import org.dnyanyog.product.ProductScreen;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class AddScreenController extends SqlConnection {
	
	@FXML
	TextField userName;
	
	@FXML
	TextField userPassword;
	
	@FXML
	TextField userMail;
	
	@FXML
	TextField userId;
	
	@FXML 
	TextField errorMessage;
	
	public void nextButtonClick() throws Exception {
		Connection connection = DriverManager.getConnection(url,username,pass);
		
		Statement statement = connection.createStatement();
		
		String query = "INSERT INTO e_commerce.user" + "(userId, userName, userPassword, userMail)" + "VALUE('" +userId.getText() + "','" + userName.getText() + "','" + userPassword.getText() +"','"
				+ userMail.getText() + "');";
		
		statement.execute(query);
		
		if((query.valueOf(userId) != null) && (query.valueOf(userName))!= null)  {
			this.errorMessage.setText("User Added");
		}else {
			this.errorMessage.setText("Error to add User");
		
			
		}
		
	}
	public void backButtonClick() throws Exception {
		new UserScreen().show();
		return;
	}
	
	

}
