package org.dnyanyog.product;

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
	TextField removeProduct;

	@FXML
	Label errorMessage;

	public void removeButtonClick() throws Exception {
		Connection connection = DriverManager.getConnection(url, username, pass);

		Statement statement = connection.createStatement();

		String query = "delete FROM e_commerce.product WHERE productName= '" + removeProduct.getText() + "';";
		statement.execute(query);
		
			this.errorMessage.setText("Product Removed");
			return;
		
		}
	public void backButtonClick() throws Exception {
		new ProductScreen().show();
		return;
	}


}
