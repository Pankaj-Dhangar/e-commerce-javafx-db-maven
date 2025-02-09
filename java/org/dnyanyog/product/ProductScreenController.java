package org.dnyanyog.product;

import org.dnyanyog.home.HomeScreen;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ProductScreenController extends ProductScreen {
	@FXML
	Button addProduct;
	@FXML
	Button searchProduct;
	@FXML
	Button removeProduct;
	@FXML
	Button updateProduct;
	
	public void addProductButtonClick() throws Exception {
		new ProductScreen().AddProductScreen();
		
	}
	public void searchProductButtonClick() throws Exception {
		new ProductScreen().SearchProductScreen();
		
	}
	public void removeProductButtonClick() throws Exception {
		new ProductScreen().RemoveProductScreen();
		
	}
	public void updateProductButtonClick() throws Exception {
		new ProductScreen().UpdateProductScreen();
	}
	public void backButtonClick() throws Exception {
		new HomeScreen().show();
		return;
	}

	

}
