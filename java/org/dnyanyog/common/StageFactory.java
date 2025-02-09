package org.dnyanyog.common;

import javafx.stage.Stage;

public class StageFactory { // Simple factory design pattern
	public static Stage stage;
	
	public static Stage getStage() {
		if(stage==null) {
			System.out.println("!!!!!!!!! Stage not created");
			System.out.println("!!!!!!!!! Closing Program.");
			System.exit(0);
		}
		return stage;
	}
	public static void setStage(Stage tempStage) {
		stage = tempStage;
	}

}
