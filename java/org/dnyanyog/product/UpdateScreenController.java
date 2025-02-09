package org.dnyanyog.product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.dnyanyog.common.SqlConnection;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class UpdateScreenController extends SqlConnection {
	@FXML
	TextField productName;
	
	@FXML
	TextField productPrice;
	
	@FXML
	TextField productQuantity;
	
	@FXML 
	Label errorMessage;
	
	@FXML
	TextField productId;
	
	
	public void updateButtonClick() throws Exception {
		Connection connection = DriverManager.getConnection(url,username,pass);
		Statement statement = connection.createStatement();
		
		String query = "UPDATE e_commerce.product SET productName ='"+ productName.getText() + "'where productId = '"+ productId.getText()+"'";
		String query1 = "UPDATE e_commerce.product SET productPrice ='"+ productPrice.getText() + "'where productId = '"+ productId.getText()+"'";
		String query2 = "UPDATE e_commerce.product SET productQuantity ='"+ productQuantity.getText() + "'where productId = '"+ productId.getText()+"'";

		statement.execute(query);
		statement.execute(query1);
		statement.execute(query2);
			this.errorMessage.setText("Product Updated");
		
	}
	public void backButtonClick() throws Exception {
		new ProductScreen().show();
		return;
	}

}

