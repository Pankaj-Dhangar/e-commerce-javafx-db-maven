package org.dnyanyog.home;

import java.io.IOException;

import org.dnyanyog.common.SqlConnection;
import org.dnyanyog.login.LoginScreen;
import org.dnyanyog.product.ProductScreen;
import org.dnyanyog.user.UserScreen;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HomeScreenController extends SqlConnection{
	
	@FXML
	Button userManagement;
	
	@FXML
	Button productManagement;
	
	@FXML
	Label errorMessage;
	
	
	public void userManagementButtonClick() throws IOException {
		new UserScreen().show();
		
	}
	public void productManagementButtonClick() throws Exception {
		new ProductScreen().show();
		
	}
	public void backButtonClick() throws Exception {
		new LoginScreen().show();
		return;
	}

}
