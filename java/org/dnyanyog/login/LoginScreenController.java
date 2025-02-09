package org.dnyanyog.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.dnyanyog.common.SqlConnection;
import org.dnyanyog.home.HomeScreen;
import org.dnyanyog.product.ProductScreen;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginScreenController extends SqlConnection {
	
	@FXML
	TextField password;
	
	@FXML
	TextField loginName;
	
	@FXML
	Label errorMessage;
	
	public void loginButtonClick() throws SQLException {
		
		
		Connection connection = DriverManager.getConnection(url,username,pass);
		Statement statement = connection.createStatement();
		
		String query = "Select * from `e_commerce`.`login` where LoginName = '" + loginName.getText() +"'and Password = '"
				+ password.getText() + "';";	
		ResultSet result = statement.executeQuery(query);
		if(result.next()) {
			this.errorMessage.setText("Login Successful");
			new HomeScreen().show();
		}else {
			this.errorMessage.setText("Login Failed");
		}
		
	}
	
}
