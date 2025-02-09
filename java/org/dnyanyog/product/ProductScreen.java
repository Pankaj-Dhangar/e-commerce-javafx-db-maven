package org.dnyanyog.product;

import java.io.IOException;

import org.dnyanyog.common.StageFactory;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class ProductScreen {

	public void show() throws Exception {
		StageFactory.getStage().setTitle("Customer Login");
		Parent actorGroup = FXMLLoader.load(getClass().getResource("/ProductOptionScreen.fxml"));
		
		Scene scene = new Scene (actorGroup,600,400);
		StageFactory.getStage().setScene(scene);
		StageFactory.getStage().show();
	}
	public void AddProductScreen() throws IOException {
		StageFactory.getStage().setTitle("Customer Login");
		Parent actorGroup = FXMLLoader.load(getClass().getResource("/AddProductScreen.fxml"));

		Scene scene = new Scene(actorGroup, 600, 400);
		StageFactory.getStage().setScene(scene);
		StageFactory.getStage().show();

	}
	public void SearchProductScreen() throws IOException {
		StageFactory.getStage().setTitle("Customer Login");
		Parent actorGroup = FXMLLoader.load(getClass().getResource("/SearchProductScreen.fxml"));

		Scene scene = new Scene(actorGroup, 600, 400);
		StageFactory.getStage().setScene(scene);
		StageFactory.getStage().show();

	}
	public void RemoveProductScreen() throws IOException {
		StageFactory.getStage().setTitle("Customer Login");
		Parent actorGroup = FXMLLoader.load(getClass().getResource("/RemoveProductScreen.fxml"));

		Scene scene = new Scene(actorGroup, 600, 400);
		StageFactory.getStage().setScene(scene);
		StageFactory.getStage().show();

	}
	public void UpdateProductScreen() throws IOException {
		StageFactory.getStage().setTitle("Customer Login");
		Parent actorGroup = FXMLLoader.load(getClass().getResource("/UpdateProductScreen.fxml"));

		Scene scene = new Scene(actorGroup, 600, 400);
		StageFactory.getStage().setScene(scene);
		StageFactory.getStage().show();

	}
}
