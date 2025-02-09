package org.dnyanyog.product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.dnyanyog.common.SqlConnection;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class AddScreenController extends SqlConnection {
	
	@FXML
	TextField productName;
	
	@FXML
	TextField productPrice;
	
	@FXML
	TextField productQuantity;
	
	@FXML
	TextField productId;
	
	@FXML 
	TextField errorMessage;
	
	public void nextButtonClick() throws Exception {
		Connection connection = DriverManager.getConnection(url,username,pass);
		
		Statement statement = connection.createStatement();
		
		String query = "INSERT INTO e_commerce.product" + "(productId, productName, productPrice, productQuantity)" + "VALUE('" +productId.getText() + "','" + productName.getText() + "','" + productPrice.getText() +"','"
				+ productQuantity.getText() + "');";
		
		statement.execute(query);
		
		if((query.valueOf(productId) != null) && (query.valueOf(productName))!= null)  {
			this.errorMessage.setText("Product Added");
		}else {
			this.errorMessage.setText("Error to add Product");
		
			
		}
		
	}
	public void backButtonClick() throws Exception {
		new ProductScreen().show();
		return;
	}
	

}
