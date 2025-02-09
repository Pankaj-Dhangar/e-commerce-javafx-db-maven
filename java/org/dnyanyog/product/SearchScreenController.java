package org.dnyanyog.product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.dnyanyog.common.SqlConnection;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SearchScreenController extends SqlConnection {
	@FXML
	TextField searchProduct;
	
	@FXML
	Label errorMessage;
	
	public void searchButtonClick() throws Exception {
		Connection connection = DriverManager.getConnection(url,username,pass);
		Statement statement = connection.createStatement();
		String query = "SELECT * FROM  e_commerce.product WHERE productName = '" + searchProduct.getText() + "';";

		statement.execute(query);
		
		if(query.isBlank()) {
			this.errorMessage.setText("Error To Serach Product !!");
		}else {
			this.errorMessage.setText("Product Found Successfully !!");
		}
	}
	public void backButtonClick() throws Exception {
		new ProductScreen().show();
		return;
	}
	

}

